package com.chenyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * @program: SpringMVC
 * @description:
 * @author: chenyu
 * @create: 2021-07-02 22:00
 */

@Controller
public class TestServletApiController {
    @RequestMapping("/servletApi")
    public String servletApi(HttpServletRequest  request ,
                             HttpServletResponse response,
                             HttpSession session) throws IOException {

        request.setAttribute("requestParam","我是request域中的数据");
        session.setAttribute("sessionParam","我是Session域中的数据");
        BufferedReader reader = request.getReader();
        return "success02";
        
    }
}
