package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-06 21:29
 */

@Controller
public class TestResourceAnalyzeController {
    @RequestMapping("/hello01")
    public String hello01(){
        System.out.println("请求收到，进入TestResourceAnalyzeController---");
        System.out.println("请求正在处理");

        return "success03";
    }
}
