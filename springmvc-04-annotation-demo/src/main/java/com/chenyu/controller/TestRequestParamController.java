package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-01 21:07
 */
@Controller
public class TestRequestParamController {
    @RequestMapping("/requestParam")
    public ModelAndView requestParam(@RequestParam(value = "username") String username
            , @RequestParam(value = "password") String password) {
        System.out.println("用户姓名:" + username);
        System.out.println("用户密码:" + password);
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("name", username);
        modelAndView.addObject("password", password);
        return modelAndView;
    }
}

