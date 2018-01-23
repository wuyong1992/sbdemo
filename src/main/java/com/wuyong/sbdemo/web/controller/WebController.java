package com.wuyong.sbdemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by JianGuo
 * on 2018/1/23
 * description: 测试thymeleaf模板引擎
 */
@Controller
@RequestMapping("/web")
public class WebController {


    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.put("title", "Hello Thymeleaf");
        return "index";
    }
}
