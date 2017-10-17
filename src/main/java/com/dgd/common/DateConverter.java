package com.dgd.common;

import com.dgd.utils.CalendarUtils;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * @Author DGD
 * @date 2017/10/17.
 * 把页面时间统一转化为Date
 */
public class DateConverter implements Converter<String,Date>{
    @Override
    public Date convert(String source) {
        return CalendarUtils.StringToDate(source, CalendarUtils.getDateStyle(source));
    }
}
