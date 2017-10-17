package com.dgd.mybatis;


import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.JDBCConnectionConfiguration;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MybatisGeneratorExtPlugin extends PluginAdapter {

    private boolean controllerOverWrite = false;
    private boolean serviceOverWrite = false;
    private boolean serviceImplOverWrite = false;
    private boolean htmlOverWrite = false;
    //private boolean htmlOverWrite = true;

    private static Connection con = null;
    private static Statement stmt = null;

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * 为了方便取实体名，在这里生成sevice,seviceImpl,controller
     *
     * @param topLevelClass
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        System.out.println();
        //model路径
        String modelType = topLevelClass.getType().toString();
        //实体名
        String modelName = modelType.substring(modelType.lastIndexOf(".") + 1);
        String originName = modelName.replace("Entity", "");
        String daoName = modelName + "Mapper";
        String daoVar = daoName.substring(0, 1).toLowerCase() + daoName.substring(1);
        String serviceName = originName + "Service";
        String serviceVar = serviceName.substring(0, 1).toLowerCase() + serviceName.substring(1);
        String serviceImplName = serviceName + "Impl";
        String controllerName = originName + "Controller";

        String mainPath = originName.toLowerCase();
        //
        generateService(serviceName, modelName, originName);

        //
        generateServiceImpl(serviceName, serviceImplName, modelName, originName, daoName, daoVar);

        //
        generateController(controllerName, serviceName, serviceVar, modelName, originName, mainPath);
        //
        generateHtml(originName, mainPath, introspectedTable);
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    private String tmplPath = FileUtils.getProjectPath() + "/src/test/resources/";
    private String frameworkpath = FileUtils.getProjectPath() + "/src/main/java/agency/framework/";
    private String frameworkWebappPath = FileUtils.getProjectPath() + "/src/main/webapp/";

    private void generateService(String serviceName, String modelName, String originName) {
        //读取模板
        String content = null;
        try {
            File serviceTmpl = FileUtils.createFile(tmplPath + "service.tmpl");
            content = FileUtils.getFileContent(serviceTmpl);
            content = content.replace("{serviceName}", serviceName).replace("{modelName}", modelName).replace("{originName}", originName);
            String outputPath = frameworkpath + "/service/" + serviceName + ".java";
            if (serviceOverWrite == false) {
                return;
            }
            File output = FileUtils.createFile(outputPath);
            FileUtils.writeString(output, content);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateServiceImpl(String serviceName, String serviceImplName, String modelName, String originName, String daoName, String daoVar) {
        //读取模板
        String content = null;
        try {
            File serviceTmpl = FileUtils.createFile(tmplPath + "serviceImpl.tmpl");
            content = FileUtils.getFileContent(serviceTmpl);
            content = content.replace("{serviceName}", serviceName).replace("{modelName}", modelName).replace("{originName}", originName)
                    .replace("{daoName}", daoName).replace("{daoVar}", daoVar).replace("{serviceImplName}", serviceImplName);
            String outputPath = frameworkpath + "/service/impl/" + serviceImplName + ".java";
            if (serviceImplOverWrite == false) {
                return;
            }
            File output = FileUtils.createFile(outputPath);

            FileUtils.writeString(output, content);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateController(String controllerName, String serviceName, String serviceVar, String modelName, String originName, String mainPath) {
        //读取模板
        String content = null;
        try {
            File serviceTmpl = FileUtils.createFile(tmplPath + "controller.tmpl");
            content = FileUtils.getFileContent(serviceTmpl);
            content = content.replace("{serviceName}", serviceName).replace("{modelName}", modelName).replace("{originName}", originName)
                    .replace("{controllerName}", controllerName).replace("{serviceVar}", serviceVar).replace("{mainPath}", mainPath);
            String outputPath = frameworkpath + "/controller/pc/" + controllerName + ".java";
            if (controllerOverWrite == false) {
                return;
            }
            File output = FileUtils.createFile(outputPath);

            FileUtils.writeString(output, content);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generateHtml(String originName, String mainPath, IntrospectedTable introspectedTable) {
        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
        String tableHead = "";
        String editForm = "";
        String jsonData = "";
        String editFormItem = "";
        for (IntrospectedColumn column : columns) {
            String label = column.getRemarks()==null ? column.getActualColumnName() : column.getRemarks();
            tableHead += "                        <th>";
            tableHead += label;
            tableHead += "</th>";
            tableHead += "\r\n";

            editForm += "                <div class=\"am-form-group\">";
            editForm += "\r\n";
            editForm += "                    <label for=\"" + column.getJavaProperty() + "\" class=\"am-u-sm-2 am-form-label\">" + label + "</label>";
            editForm += "\r\n";
            editForm += "                    <div class=\"am-u-sm-10\">";
            editForm += "\r\n";
            editForm += "                       <input type=\"text\" id=\"" + column.getJavaProperty() + "\" name=\"" + column.getJavaProperty() + "\" >";
            editForm += "\r\n";
            editForm += "                    </div>";
            editForm += "\r\n";
            editForm += "                </div>";
            editForm += "\r\n";
            editForm += "\r\n";


            /****jsondata***/
            jsonData += "                    bodyChildrenHtml += '<td>';";
            jsonData += "\r\n";
            jsonData += "                    bodyChildrenHtml += jsonData." + column.getJavaProperty() + " || '';";
            jsonData += "\r\n";
            jsonData += "                    bodyChildrenHtml += '</td>';";
            jsonData += "\r\n";
            jsonData += "\r\n";


            editFormItem += "            $('#editForm input[name=" + column.getJavaProperty() + "]').val(tableData[rowNum]." + column.getJavaProperty() + " || '');";
            editFormItem += "\r\n";

        }
        //读取模板
        String content = null;
        try {
            File html = FileUtils.createFile(tmplPath + "html.tmpl");
            content = FileUtils.getFileContent(html);
            content = content.replace("{table-head}", tableHead).replace("{list-url}", "/pc/" + mainPath + "/list").replace("{save-url}", "/pc/" + mainPath + "/save")
                    .replace("{editForm}", editForm).replace("{jsonData}", jsonData).replace("{editFormItem}", editFormItem)
                    .replace("{deleteflag-url}", "/pc/" + mainPath + "/deleteflag");
            String outputDir = frameworkWebappPath + "admin/module/" + originName + "/";
            String outputPath = outputDir + (originName + "Manage") + ".html";
            //initMenuData(introspectedTable,originName,"/admin/module/" + originName + "/" + (originName+ "Manage") +".html");
            if (htmlOverWrite == false) {
                return;
            }

            File outputDirFile = FileUtils.getFile(outputDir);
            if (!outputDirFile.exists()) {
                outputDirFile.mkdir();
            }
            File output = FileUtils.createFile(outputPath);
            FileUtils.writeString(output, content);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Connection getConn(IntrospectedTable introspectedTable) {
        if (con != null) return con;
        JDBCConnectionConfiguration jdbcConfig = introspectedTable.getContext().getJdbcConnectionConfiguration();
        try {
            //加载MySql的驱动类
            Class.forName(jdbcConfig.getDriverClass());
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(jdbcConfig.getConnectionURL(), jdbcConfig.getUserId(), jdbcConfig.getPassword());
            return con;
        } catch (SQLException se) {
            System.out.println("数据库连接失败！");
            se.printStackTrace();
        }
        return null;
    }

    private Statement getStmt(IntrospectedTable introspectedTable) {
        if (stmt != null) {
            return stmt;
        }
        if (con == null) {
            getConn(introspectedTable);
        }
        try {
            con.setAutoCommit(true);
            Statement stmt = con.createStatement();
            return stmt;
//
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
