package com.moekr.demo.dubbo.producer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.moekr.demo.dubbo.producer")
public class Application extends SpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
