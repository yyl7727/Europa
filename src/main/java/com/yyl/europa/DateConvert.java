package com.yyl.europa;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert implements Converter<String, Date> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");

    public Date convert(String s) {
        try {
            return simpleDateFormat.parse(s);
        }catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
    }
}
