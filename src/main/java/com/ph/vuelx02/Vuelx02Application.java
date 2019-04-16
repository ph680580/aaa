package com.ph.vuelx02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ph.vuelx02.dao")
public class Vuelx02Application {

    public static void main(String[] args) {
        SpringApplication.run(Vuelx02Application.class, args);
    }

}
