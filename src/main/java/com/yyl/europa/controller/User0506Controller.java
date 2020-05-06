package com.yyl.europa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("0506")
public class User0506Controller {
    /*
    在springmvc的controller方法中如何获取web元素
     */
    @RequestMapping("f1")
    public String f1(HttpServletRequest request, HttpSession session, HttpServletResponse response){
        request.setAttribute("a","书包");
        session.setAttribute("a","钱包");
        response.setContentType("text/html;charset=utf-8");
        return "01";
    }

    @RequestMapping("f2")
    public String f2(Model model){
        model.addAttribute("a","fak");
        return "01";
    }

    @RequestMapping("f3")
    public String f3(Map<String, String> map){
        map.put("a","ccc");
        return "01";
    }

    @RequestMapping("f4")
    public String f4(RedirectAttributes attributes){
        attributes.addAttribute("a","重定向");
        return "redirect:/view/01.jsp";
    }
}
