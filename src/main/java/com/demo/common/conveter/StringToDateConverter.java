package com.demo.common.conveter;

import jodd.util.StringUtil;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    private static final String[] FORMATS = new String[]{"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd", "HH:mm:ss", "yyyy-MM-dd'T'HH:mm"};

    public StringToDateConverter() {
    }

    public Date convert(String source) {
        if (StringUtil.isBlank(source)) {
            return null;
        } else {
            try {
                return DateUtils.parseDate(source, FORMATS);
            } catch (ParseException var3) {
                return null;
            }
        }
    }
}