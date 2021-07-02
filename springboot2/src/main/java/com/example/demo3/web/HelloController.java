package com.example.demo3.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${name}")
    String value;

    @Value("${age}")
    String age;

    @RequestMapping("/index")
    public @ResponseBody
    String hello() {
        return value + "已经" + age;
    }
}
