package com.dgd.mybatis;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

public class MybatisUUIDKeyPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        addSelectKey(element);
        return super.sqlMapInsertElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        addSelectKey(element);
        return super.sqlMapInsertSelectiveElementGenerated(element, introspectedTable);
    }

    /**
     * 生成selectkey标签
     * @param element
     */
    private void addSelectKey(XmlElement element){

        XmlElement selectKeyXmlElement = new XmlElement("selectKey");
        List<Attribute> attributes=selectKeyXmlElement.getAttributes();
        attributes.clear();
        Attribute resultType = new Attribute("resultType","java.lang.String");
        attributes.add(resultType);
        Attribute keyProperty = new Attribute("keyProperty","id");
        attributes.add(keyProperty);
        Attribute order = new Attribute("order","BEFORE");
        attributes.add(order);

        selectKeyXmlElement.addElement(0,new TextElement("select REPLACE(UUID(),'-','')"));

        element.addElement(0,selectKeyXmlElement);

    }

}
