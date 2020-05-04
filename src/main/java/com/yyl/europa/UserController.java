package com.yyl.europa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("save")
    public String save(int i){
        System.out.println(i);
        return null;
    }

    @RequestMapping("f2")
    public String f2(UserInfo userInfo){
        System.out.println(userInfo);
        return null;
    }
}
