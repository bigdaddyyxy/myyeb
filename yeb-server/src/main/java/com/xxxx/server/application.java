package com.xxxx.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * starter
 *
 */

@SpringBootApplication
@MapperScan("com.xxxx.server.mapper")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class,args);
    }
}
