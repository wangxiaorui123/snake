package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:wangxiaorui
 * @create 2019年11月26日16:59:00
 */
@Controller
public class LoginController {

    private final static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "hello")
    @ResponseBody
    public String Hello(){
        return "Heoll Spring Boot";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        LOGGER.debug("[login] 进入login方法准备返回login页面");
        return "/login";
    }
}
