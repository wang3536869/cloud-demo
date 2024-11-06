package com.wang.dish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.dish.mapper")
public class DishApplication {
    public static void main(String[] args) {
        SpringApplication.run(DishApplication.class,args);
    }
}
