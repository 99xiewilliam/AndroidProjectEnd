package com.example.androidproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan("com.example.androidproject.dao")
public class AndroidProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidProjectApplication.class, args);
    }

}
