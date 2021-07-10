package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-01 21:58
 */

@Controller
public class TestCookieValueController {

    @RequestMapping("/cookieValue")
    public ModelAndView cookieValue(@CookieValue(value = "JSESSIONID") String sessionValue){
        System.out.println("进来了");
        System.out.println(sessionValue);
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("sessionValue",sessionValue);
        return modelAndView;
    }
}
