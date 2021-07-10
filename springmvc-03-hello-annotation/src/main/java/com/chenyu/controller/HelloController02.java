package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-06-29 15:21
 */

@Controller
@RequestMapping("/HelloController")
public class HelloController02 {
    @RequestMapping("/hello")
    public String Hello(Model model) {
        System.out.println("测试");
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", "hello,SpringMVC--annotation");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}
