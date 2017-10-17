package com.dgd.controller;

import com.dgd.entity.TTimerManage;
import com.dgd.persistence.dao.TTimerManageMapper;
import com.dgd.service.QuartzManagerService;
import com.dgd.utils.CalendarUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author DGD
 * @date 2017/10/17.
 */
@RestController
@RequestMapping("/test")
public class TestController{
    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TTimerManageMapper timerManageMapper;
    @Autowired
    private QuartzManagerService quartzManagerService;
    @RequestMapping(value = "/hello")
    public Map test(String name) {
        Map<String,Object> resultData =  new HashMap();
        resultData.put("code", 0);
        resultData.put("msg", "Hello,"+name);
        TTimerManage timerManage = timerManageMapper.selectByPrimaryKey(8);
        quartzManagerService.createTimerTask(timerManage);
        resultData.put("data", timerManage.getTimerJobName());
        log.info("成功啦~~"+ CalendarUtils.getCurrentDate());
        return resultData;
    }
}
