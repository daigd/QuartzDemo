package com.dgd.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTimerManageExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public TTimerManageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTimerIdIsNull() {
            addCriterion("timer_id is null");
            return (Criteria) this;
        }

        public Criteria andTimerIdIsNotNull() {
            addCriterion("timer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimerIdEqualTo(Integer value) {
            addCriterion("timer_id =", value, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdNotEqualTo(Integer value) {
            addCriterion("timer_id <>", value, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdGreaterThan(Integer value) {
            addCriterion("timer_id >", value, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("timer_id >=", value, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdLessThan(Integer value) {
            addCriterion("timer_id <", value, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdLessThanOrEqualTo(Integer value) {
            addCriterion("timer_id <=", value, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdIn(List<Integer> values) {
            addCriterion("timer_id in", values, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdNotIn(List<Integer> values) {
            addCriterion("timer_id not in", values, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdBetween(Integer value1, Integer value2) {
            addCriterion("timer_id between", value1, value2, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("timer_id not between", value1, value2, "timerId");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameIsNull() {
            addCriterion("timer_job_name is null");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameIsNotNull() {
            addCriterion("timer_job_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameEqualTo(String value) {
            addCriterion("timer_job_name =", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameNotEqualTo(String value) {
            addCriterion("timer_job_name <>", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameGreaterThan(String value) {
            addCriterion("timer_job_name >", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("timer_job_name >=", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameLessThan(String value) {
            addCriterion("timer_job_name <", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameLessThanOrEqualTo(String value) {
            addCriterion("timer_job_name <=", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameLike(String value) {
            addCriterion("timer_job_name like", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameNotLike(String value) {
            addCriterion("timer_job_name not like", value, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameIn(List<String> values) {
            addCriterion("timer_job_name in", values, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameNotIn(List<String> values) {
            addCriterion("timer_job_name not in", values, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameBetween(String value1, String value2) {
            addCriterion("timer_job_name between", value1, value2, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerJobNameNotBetween(String value1, String value2) {
            addCriterion("timer_job_name not between", value1, value2, "timerJobName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameIsNull() {
            addCriterion("timer_trigger_name is null");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameIsNotNull() {
            addCriterion("timer_trigger_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameEqualTo(String value) {
            addCriterion("timer_trigger_name =", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameNotEqualTo(String value) {
            addCriterion("timer_trigger_name <>", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameGreaterThan(String value) {
            addCriterion("timer_trigger_name >", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("timer_trigger_name >=", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameLessThan(String value) {
            addCriterion("timer_trigger_name <", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameLessThanOrEqualTo(String value) {
            addCriterion("timer_trigger_name <=", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameLike(String value) {
            addCriterion("timer_trigger_name like", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameNotLike(String value) {
            addCriterion("timer_trigger_name not like", value, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameIn(List<String> values) {
            addCriterion("timer_trigger_name in", values, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameNotIn(List<String> values) {
            addCriterion("timer_trigger_name not in", values, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameBetween(String value1, String value2) {
            addCriterion("timer_trigger_name between", value1, value2, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerTriggerNameNotBetween(String value1, String value2) {
            addCriterion("timer_trigger_name not between", value1, value2, "timerTriggerName");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionIsNull() {
            addCriterion("timer_cron_expression is null");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionIsNotNull() {
            addCriterion("timer_cron_expression is not null");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionEqualTo(String value) {
            addCriterion("timer_cron_expression =", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionNotEqualTo(String value) {
            addCriterion("timer_cron_expression <>", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionGreaterThan(String value) {
            addCriterion("timer_cron_expression >", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("timer_cron_expression >=", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionLessThan(String value) {
            addCriterion("timer_cron_expression <", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("timer_cron_expression <=", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionLike(String value) {
            addCriterion("timer_cron_expression like", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionNotLike(String value) {
            addCriterion("timer_cron_expression not like", value, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionIn(List<String> values) {
            addCriterion("timer_cron_expression in", values, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionNotIn(List<String> values) {
            addCriterion("timer_cron_expression not in", values, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionBetween(String value1, String value2) {
            addCriterion("timer_cron_expression between", value1, value2, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerCronExpressionNotBetween(String value1, String value2) {
            addCriterion("timer_cron_expression not between", value1, value2, "timerCronExpression");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectIsNull() {
            addCriterion("timer_target_object is null");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectIsNotNull() {
            addCriterion("timer_target_object is not null");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectEqualTo(String value) {
            addCriterion("timer_target_object =", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectNotEqualTo(String value) {
            addCriterion("timer_target_object <>", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectGreaterThan(String value) {
            addCriterion("timer_target_object >", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectGreaterThanOrEqualTo(String value) {
            addCriterion("timer_target_object >=", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectLessThan(String value) {
            addCriterion("timer_target_object <", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectLessThanOrEqualTo(String value) {
            addCriterion("timer_target_object <=", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectLike(String value) {
            addCriterion("timer_target_object like", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectNotLike(String value) {
            addCriterion("timer_target_object not like", value, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectIn(List<String> values) {
            addCriterion("timer_target_object in", values, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectNotIn(List<String> values) {
            addCriterion("timer_target_object not in", values, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectBetween(String value1, String value2) {
            addCriterion("timer_target_object between", value1, value2, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerTargetObjectNotBetween(String value1, String value2) {
            addCriterion("timer_target_object not between", value1, value2, "timerTargetObject");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameIsNull() {
            addCriterion("timer_method_name is null");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameIsNotNull() {
            addCriterion("timer_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameEqualTo(String value) {
            addCriterion("timer_method_name =", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameNotEqualTo(String value) {
            addCriterion("timer_method_name <>", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameGreaterThan(String value) {
            addCriterion("timer_method_name >", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("timer_method_name >=", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameLessThan(String value) {
            addCriterion("timer_method_name <", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameLessThanOrEqualTo(String value) {
            addCriterion("timer_method_name <=", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameLike(String value) {
            addCriterion("timer_method_name like", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameNotLike(String value) {
            addCriterion("timer_method_name not like", value, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameIn(List<String> values) {
            addCriterion("timer_method_name in", values, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameNotIn(List<String> values) {
            addCriterion("timer_method_name not in", values, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameBetween(String value1, String value2) {
            addCriterion("timer_method_name between", value1, value2, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerMethodNameNotBetween(String value1, String value2) {
            addCriterion("timer_method_name not between", value1, value2, "timerMethodName");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeIsNull() {
            addCriterion("timer_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeIsNotNull() {
            addCriterion("timer_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeEqualTo(Date value) {
            addCriterion("timer_start_time =", value, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeNotEqualTo(Date value) {
            addCriterion("timer_start_time <>", value, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeGreaterThan(Date value) {
            addCriterion("timer_start_time >", value, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("timer_start_time >=", value, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeLessThan(Date value) {
            addCriterion("timer_start_time <", value, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("timer_start_time <=", value, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeIn(List<Date> values) {
            addCriterion("timer_start_time in", values, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeNotIn(List<Date> values) {
            addCriterion("timer_start_time not in", values, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeBetween(Date value1, Date value2) {
            addCriterion("timer_start_time between", value1, value2, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("timer_start_time not between", value1, value2, "timerStartTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeIsNull() {
            addCriterion("timer_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeIsNotNull() {
            addCriterion("timer_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeEqualTo(Date value) {
            addCriterion("timer_end_time =", value, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeNotEqualTo(Date value) {
            addCriterion("timer_end_time <>", value, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeGreaterThan(Date value) {
            addCriterion("timer_end_time >", value, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("timer_end_time >=", value, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeLessThan(Date value) {
            addCriterion("timer_end_time <", value, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("timer_end_time <=", value, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeIn(List<Date> values) {
            addCriterion("timer_end_time in", values, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeNotIn(List<Date> values) {
            addCriterion("timer_end_time not in", values, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeBetween(Date value1, Date value2) {
            addCriterion("timer_end_time between", value1, value2, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("timer_end_time not between", value1, value2, "timerEndTime");
            return (Criteria) this;
        }

        public Criteria andTimerStatusIsNull() {
            addCriterion("timer_status is null");
            return (Criteria) this;
        }

        public Criteria andTimerStatusIsNotNull() {
            addCriterion("timer_status is not null");
            return (Criteria) this;
        }

        public Criteria andTimerStatusEqualTo(Integer value) {
            addCriterion("timer_status =", value, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusNotEqualTo(Integer value) {
            addCriterion("timer_status <>", value, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusGreaterThan(Integer value) {
            addCriterion("timer_status >", value, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("timer_status >=", value, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusLessThan(Integer value) {
            addCriterion("timer_status <", value, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("timer_status <=", value, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusIn(List<Integer> values) {
            addCriterion("timer_status in", values, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusNotIn(List<Integer> values) {
            addCriterion("timer_status not in", values, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusBetween(Integer value1, Integer value2) {
            addCriterion("timer_status between", value1, value2, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("timer_status not between", value1, value2, "timerStatus");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionIsNull() {
            addCriterion("timer_description is null");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionIsNotNull() {
            addCriterion("timer_description is not null");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionEqualTo(String value) {
            addCriterion("timer_description =", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionNotEqualTo(String value) {
            addCriterion("timer_description <>", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionGreaterThan(String value) {
            addCriterion("timer_description >", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("timer_description >=", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionLessThan(String value) {
            addCriterion("timer_description <", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionLessThanOrEqualTo(String value) {
            addCriterion("timer_description <=", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionLike(String value) {
            addCriterion("timer_description like", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionNotLike(String value) {
            addCriterion("timer_description not like", value, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionIn(List<String> values) {
            addCriterion("timer_description in", values, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionNotIn(List<String> values) {
            addCriterion("timer_description not in", values, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionBetween(String value1, String value2) {
            addCriterion("timer_description between", value1, value2, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andTimerDescriptionNotBetween(String value1, String value2) {
            addCriterion("timer_description not between", value1, value2, "timerDescription");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNull() {
            addCriterion("modify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("modify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(Integer value) {
            addCriterion("modify_user_id =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(Integer value) {
            addCriterion("modify_user_id <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(Integer value) {
            addCriterion("modify_user_id >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_user_id >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(Integer value) {
            addCriterion("modify_user_id <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("modify_user_id <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<Integer> values) {
            addCriterion("modify_user_id in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<Integer> values) {
            addCriterion("modify_user_id not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("modify_user_id between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_user_id not between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNull() {
            addCriterion("extend1 is null");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNotNull() {
            addCriterion("extend1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend1EqualTo(String value) {
            addCriterion("extend1 =", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotEqualTo(String value) {
            addCriterion("extend1 <>", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThan(String value) {
            addCriterion("extend1 >", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThanOrEqualTo(String value) {
            addCriterion("extend1 >=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThan(String value) {
            addCriterion("extend1 <", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThanOrEqualTo(String value) {
            addCriterion("extend1 <=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Like(String value) {
            addCriterion("extend1 like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotLike(String value) {
            addCriterion("extend1 not like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1In(List<String> values) {
            addCriterion("extend1 in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotIn(List<String> values) {
            addCriterion("extend1 not in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Between(String value1, String value2) {
            addCriterion("extend1 between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotBetween(String value1, String value2) {
            addCriterion("extend1 not between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNull() {
            addCriterion("extend2 is null");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNotNull() {
            addCriterion("extend2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend2EqualTo(String value) {
            addCriterion("extend2 =", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotEqualTo(String value) {
            addCriterion("extend2 <>", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThan(String value) {
            addCriterion("extend2 >", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThanOrEqualTo(String value) {
            addCriterion("extend2 >=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThan(String value) {
            addCriterion("extend2 <", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThanOrEqualTo(String value) {
            addCriterion("extend2 <=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Like(String value) {
            addCriterion("extend2 like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotLike(String value) {
            addCriterion("extend2 not like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2In(List<String> values) {
            addCriterion("extend2 in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotIn(List<String> values) {
            addCriterion("extend2 not in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Between(String value1, String value2) {
            addCriterion("extend2 between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotBetween(String value1, String value2) {
            addCriterion("extend2 not between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNull() {
            addCriterion("extend3 is null");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNotNull() {
            addCriterion("extend3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend3EqualTo(String value) {
            addCriterion("extend3 =", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotEqualTo(String value) {
            addCriterion("extend3 <>", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThan(String value) {
            addCriterion("extend3 >", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThanOrEqualTo(String value) {
            addCriterion("extend3 >=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThan(String value) {
            addCriterion("extend3 <", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThanOrEqualTo(String value) {
            addCriterion("extend3 <=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Like(String value) {
            addCriterion("extend3 like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotLike(String value) {
            addCriterion("extend3 not like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3In(List<String> values) {
            addCriterion("extend3 in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotIn(List<String> values) {
            addCriterion("extend3 not in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Between(String value1, String value2) {
            addCriterion("extend3 between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotBetween(String value1, String value2) {
            addCriterion("extend3 not between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend4IsNull() {
            addCriterion("extend4 is null");
            return (Criteria) this;
        }

        public Criteria andExtend4IsNotNull() {
            addCriterion("extend4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend4EqualTo(String value) {
            addCriterion("extend4 =", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotEqualTo(String value) {
            addCriterion("extend4 <>", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4GreaterThan(String value) {
            addCriterion("extend4 >", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4GreaterThanOrEqualTo(String value) {
            addCriterion("extend4 >=", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4LessThan(String value) {
            addCriterion("extend4 <", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4LessThanOrEqualTo(String value) {
            addCriterion("extend4 <=", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4Like(String value) {
            addCriterion("extend4 like", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotLike(String value) {
            addCriterion("extend4 not like", value, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4In(List<String> values) {
            addCriterion("extend4 in", values, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotIn(List<String> values) {
            addCriterion("extend4 not in", values, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4Between(String value1, String value2) {
            addCriterion("extend4 between", value1, value2, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend4NotBetween(String value1, String value2) {
            addCriterion("extend4 not between", value1, value2, "extend4");
            return (Criteria) this;
        }

        public Criteria andExtend5IsNull() {
            addCriterion("extend5 is null");
            return (Criteria) this;
        }

        public Criteria andExtend5IsNotNull() {
            addCriterion("extend5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend5EqualTo(String value) {
            addCriterion("extend5 =", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotEqualTo(String value) {
            addCriterion("extend5 <>", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5GreaterThan(String value) {
            addCriterion("extend5 >", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5GreaterThanOrEqualTo(String value) {
            addCriterion("extend5 >=", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5LessThan(String value) {
            addCriterion("extend5 <", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5LessThanOrEqualTo(String value) {
            addCriterion("extend5 <=", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5Like(String value) {
            addCriterion("extend5 like", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotLike(String value) {
            addCriterion("extend5 not like", value, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5In(List<String> values) {
            addCriterion("extend5 in", values, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotIn(List<String> values) {
            addCriterion("extend5 not in", values, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5Between(String value1, String value2) {
            addCriterion("extend5 between", value1, value2, "extend5");
            return (Criteria) this;
        }

        public Criteria andExtend5NotBetween(String value1, String value2) {
            addCriterion("extend5 not between", value1, value2, "extend5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}