package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-01 21:34
 */

@Controller
public class TestRequestHeaderController {
    @RequestMapping("/requestHeader")
    public ModelAndView requestHeader(@RequestHeader(value = "User-Agent") String headValue) {
        System.out.println(headValue);
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("headValue", headValue);
        return modelAndView;
    }
}
