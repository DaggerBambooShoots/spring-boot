package com.example.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDubboMybatisRedisJspConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboMybatisRedisJspConsumerApplication.class, args);
    }

}
