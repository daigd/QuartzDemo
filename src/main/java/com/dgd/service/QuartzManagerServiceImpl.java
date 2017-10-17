package com.dgd.service;

import com.dgd.common.exception.TaskException;
import com.dgd.entity.TTimerManage;
import com.dgd.entity.TTimerManageExample;
import com.dgd.persistence.dao.TTimerManageMapper;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author DGD
 * @date 2017/10/17.
 */
@Service
public class QuartzManagerServiceImpl implements QuartzManagerService {
    private Logger log = LoggerFactory.getLogger(QuartzManagerServiceImpl.class);

    @Resource(name = "quartzScheduler")
    private Scheduler scheduler;
    @Autowired
    private TTimerManageMapper timerManageMapper;
    @Override
    public List getTaskList(TTimerManageExample example) {
        return null;
    }

    @Override
    public TTimerManage getTaskTimerManageById(Integer timerId) {
        return null;
    }

    @Override
    public int createTaskTimerManageRecord(TTimerManage timerManage) {
        return 0;
    }

    @Override
    public int updateTaskTimerManageRecord(TTimerManage timerManage, TTimerManageExample example) {
        return 0;
    }

    @Override
    public boolean createTimerTask(TTimerManage timerManage) throws TaskException {
        if (timerManage == null) {
            throw new TaskException("定时任务不能为空");
        }
        AtomicBoolean result = new AtomicBoolean(false);
        try {
            Trigger trigger = scheduler.getTrigger(new TriggerKey(timerManage.getTimerTriggerName(),timerManage.getTimerTriggerName()));
            if (trigger != null) {
                //已存在触发器,即计划任务已存在
                if (scheduler.checkExists(trigger.getJobKey()) && scheduler.checkExists(trigger.getKey())) {
                    //修改任务状态
                    timerManage.setTimerStatus(1);
                    timerManage.setModifyTime(new Date());
                    timerManageMapper.updateByPrimaryKey(timerManage);
                    //记录日志
                    result.set(true);
                }

            }else{
                // 1、创建一个JobDetail实例
                JobDetail jobDetail = null;
                // 1、创建一个JobDetail实例
                Object object = Class.forName(timerManage.getTimerTargetObject()).newInstance();
                if (object instanceof Job) {
                    Job job = (Job) object;
                    jobDetail = JobBuilder.newJob(job.getClass())
                            //任务执行类
                            .withIdentity(timerManage.getTimerJobName(),timerManage.getTimerJobName())
                            //任务名，任务组
                            .build();
                }
                if (jobDetail != null) {
                    //设置表达式
                    CronScheduleBuilder builder = CronScheduleBuilder.cronSchedule(timerManage.getTimerCronExpression());
                    //创建Trigger
                    trigger = TriggerBuilder.newTrigger()
                            //触发器名,触发器组名
                            .withIdentity(timerManage.getTimerTriggerName(),timerManage.getTimerTriggerName())
                            .startNow()
                            .withSchedule(builder)
                            .build();
                    //将该任务添加到监听器中
                    //scheduler.getListenerManager().addJobListener(new TaskJobListener(), KeyMatcher.keyEquals(jobDetail.getKey()));
                    //调度执行
                    scheduler.scheduleJob(jobDetail, trigger);
                    scheduler.start();

                    //改变任务状态
                    if (scheduler.checkExists(jobDetail.getKey()) && scheduler.checkExists(trigger.getKey())) {
                        timerManage.setTimerStatus(2); //进行中
                        timerManage.setModifyTime(new Date());
                        timerManageMapper.updateByPrimaryKey(timerManage);
                        //记录日志

                        result.set(true);
                    }
                }
            }
        } catch (Exception e) {
            timerManage.setTimerStatus(3); //运行失败
            timerManage.setModifyTime(new Date());
            timerManage.setModifyUserId(-1);
            timerManageMapper.updateByPrimaryKey(timerManage);
            //记录日志

        }
        return result.get();
    }

    @Override
    public boolean removeTimerTask(TTimerManage timerManage) throws TaskException {
        return false;
    }
}
