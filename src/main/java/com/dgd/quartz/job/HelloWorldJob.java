package com.dgd.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author DGD
 * @date 2017/10/17.
 */
public class HelloWorldJob implements Job {
    Logger log = LoggerFactory.getLogger(HelloWorldJob.class);
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("---------------开始执行HelloWorldJOb测试任务:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"-------------------");
        log.info("--------------- Hello World! ---------------");
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("---------------结束执行HelloWorldJOb测试任务:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"-------------------");
    }
}
