package com.yyl.europa.controller;

import com.yyl.europa.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("0507")
public class User0507Controller {
    @RequestMapping("f1")
    public void f1(@RequestBody UserInfo userInfo){
        System.out.println("参数" + userInfo + "!!");
    }
}
