package com.yyl.europa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("save")
    public String save(){
        System.out.println("userController.save()");
        return null;
    }
}
