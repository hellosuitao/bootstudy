package com.ruixun.bootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ruixun.bootstudy.mapper")
public class BootstudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootstudyApplication.class, args);
    }
}
