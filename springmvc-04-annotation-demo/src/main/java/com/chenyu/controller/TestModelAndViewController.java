package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-04 14:34
 */
@Controller
public class TestModelAndViewController {
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        System.out.println("宸宇正在测试ModelAndView");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("chenyu_viewName");
        modelAndView.addObject("msg", new Date().toString());//这里的数据实际上是放到了request域中
        return  modelAndView;
    }
}
