package com.dgd.service;

import com.dgd.common.exception.TaskException;
import com.dgd.entity.TTimerManage;
import com.dgd.entity.TTimerManageExample;

import java.io.Serializable;
import java.util.List;

/**
 * @Author DGD
 * @date 2017/10/17.
 */
public interface QuartzManagerService extends Serializable{
    /**
     * 获取定时任务列表
     * @param example
     * @return
     */
    List getTaskList(TTimerManageExample example);

    /**
     * 通过ID查询定时任务
     * @param timerId
     * @return
     */
    TTimerManage getTaskTimerManageById(Integer timerId);

    /**
     * 添加定时管理任务记录
     * @param timerManage
     * @return
     */
    int createTaskTimerManageRecord(TTimerManage timerManage);

    /**
     * 更新定时管理任务记录
     * @param timerManage
     * @return
     */
    int updateTaskTimerManageRecord(TTimerManage timerManage,TTimerManageExample example);

    /**
     * 创建定时任务并执行
     * @param timerManage
     * @return
     */
    boolean createTimerTask(TTimerManage timerManage) throws TaskException;

    /**
     * 停止执行定时任务
     * @param timerManage
     * @return
     */
    boolean removeTimerTask(TTimerManage timerManage) throws TaskException;
}
