package com.example.smovie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication()
@MapperScan("com.example.smovie.dao")
public class SmovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmovieApplication.class, args);
    }

}
