package com.dgd.entity;

import java.io.Serializable;
import java.util.Date;

public class TTimerManage implements Serializable {
    private Integer timerId;

    private String timerJobName;

    private String timerTriggerName;

    private String timerCronExpression;

    private String timerTargetObject;

    private String timerMethodName;

    private Date timerStartTime;

    private Date timerEndTime;

    private Integer timerStatus;

    private String timerDescription;

    private Integer createUserId;

    private Date createTime;

    private Integer modifyUserId;

    private Date modifyTime;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

    private String extend5;

    private static final long serialVersionUID = 1L;

    public Integer getTimerId() {
        return timerId;
    }

    public void setTimerId(Integer timerId) {
        this.timerId = timerId;
    }

    public String getTimerJobName() {
        return timerJobName;
    }

    public void setTimerJobName(String timerJobName) {
        this.timerJobName = timerJobName == null ? null : timerJobName.trim();
    }

    public String getTimerTriggerName() {
        return timerTriggerName;
    }

    public void setTimerTriggerName(String timerTriggerName) {
        this.timerTriggerName = timerTriggerName == null ? null : timerTriggerName.trim();
    }

    public String getTimerCronExpression() {
        return timerCronExpression;
    }

    public void setTimerCronExpression(String timerCronExpression) {
        this.timerCronExpression = timerCronExpression == null ? null : timerCronExpression.trim();
    }

    public String getTimerTargetObject() {
        return timerTargetObject;
    }

    public void setTimerTargetObject(String timerTargetObject) {
        this.timerTargetObject = timerTargetObject == null ? null : timerTargetObject.trim();
    }

    public String getTimerMethodName() {
        return timerMethodName;
    }

    public void setTimerMethodName(String timerMethodName) {
        this.timerMethodName = timerMethodName == null ? null : timerMethodName.trim();
    }

    public Date getTimerStartTime() {
        return timerStartTime;
    }

    public void setTimerStartTime(Date timerStartTime) {
        this.timerStartTime = timerStartTime;
    }

    public Date getTimerEndTime() {
        return timerEndTime;
    }

    public void setTimerEndTime(Date timerEndTime) {
        this.timerEndTime = timerEndTime;
    }

    public Integer getTimerStatus() {
        return timerStatus;
    }

    public void setTimerStatus(Integer timerStatus) {
        this.timerStatus = timerStatus;
    }

    public String getTimerDescription() {
        return timerDescription;
    }

    public void setTimerDescription(String timerDescription) {
        this.timerDescription = timerDescription == null ? null : timerDescription.trim();
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1 == null ? null : extend1.trim();
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2 == null ? null : extend2.trim();
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3 == null ? null : extend3.trim();
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4 == null ? null : extend4.trim();
    }

    public String getExtend5() {
        return extend5;
    }

    public void setExtend5(String extend5) {
        this.extend5 = extend5 == null ? null : extend5.trim();
    }
}