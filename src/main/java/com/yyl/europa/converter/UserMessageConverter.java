package com.yyl.europa.converter;

import com.yyl.europa.pojo.UserInfo;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserMessageConverter extends AbstractHttpMessageConverter {
    protected boolean supports(Class aClass) {
        System.out.println("supports()" + aClass);
        return UserInfo.class == aClass;
    }

    protected Object readInternal(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        System.out.println("readInternal()");

        InputStream inputStream = httpInputMessage.getBody();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = bufferedReader.readLine())!=null){
            stringBuilder.append(line);
        }
        bufferedReader.close();

        String[] strings = stringBuilder.toString().split("=")[1].split("-");

        UserInfo userInfo = new UserInfo();
        userInfo.setId(Integer.parseInt(strings[0]));
        userInfo.setUsername(strings[1]);
        userInfo.setPassword(strings[2]);
        return userInfo;
    }

    protected void writeInternal(Object o, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        System.out.println("writeInternal()");
    }
}
