package com.example.springbootfirst.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebTestController {

    @RequestMapping(value = "index")
    public @ResponseBody
    String index() {
        return "hellotest";
    }
}
