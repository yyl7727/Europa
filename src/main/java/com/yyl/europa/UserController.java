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
        return "redirect:/user/f4";
    }

    @RequestMapping("f3")
    public String f3(){
        System.out.println("f3..");
        return "forward:/user/f4";
    }

    @RequestMapping("f4")
    public String f4(){
        System.out.println("f4..");
        return null;
    }
}
