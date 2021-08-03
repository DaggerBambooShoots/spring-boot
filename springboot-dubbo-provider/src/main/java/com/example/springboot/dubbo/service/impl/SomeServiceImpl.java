package com.example.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springboot.dubbo.service.SomeService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = SomeService.class,version = "1.0.0",timeout = 35000)
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello() {
        return "hello springboot";
    }
}
