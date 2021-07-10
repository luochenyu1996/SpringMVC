package com.chenyu.controller;

import com.chenyu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-01 22:49
 */

@Controller
public class TestPoJoController {
    @RequestMapping("/poJo")
    public  ModelAndView  poJo(User user){
        System.out.println("测试 进入");
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("msg","测试");
        return  modelAndView;
    }
}
