package com.example.androidproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan("com.example.androidproject.dao")
public class AndroidProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AndroidProjectApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AndroidProjectApplication.class);
    }

}
