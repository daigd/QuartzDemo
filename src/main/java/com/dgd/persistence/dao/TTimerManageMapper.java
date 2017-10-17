package com.dgd.persistence.dao;

import com.dgd.entity.TTimerManage;
import com.dgd.entity.TTimerManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTimerManageMapper {
    int countByExample(TTimerManageExample example);

    int deleteByExample(TTimerManageExample example);

    int deleteByPrimaryKey(Integer timerId);

    int insert(TTimerManage record);

    int insertSelective(TTimerManage record);

    List<TTimerManage> selectByExample(TTimerManageExample example);

    TTimerManage selectByPrimaryKey(Integer timerId);

    int updateByExampleSelective(@Param("record") TTimerManage record, @Param("example") TTimerManageExample example);

    int updateByExample(@Param("record") TTimerManage record, @Param("example") TTimerManageExample example);

    int updateByPrimaryKeySelective(TTimerManage record);

    int updateByPrimaryKey(TTimerManage record);
}