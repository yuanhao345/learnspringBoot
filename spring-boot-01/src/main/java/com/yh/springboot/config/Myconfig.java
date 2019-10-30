package com.yh.springboot.config;

import com.yh.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
