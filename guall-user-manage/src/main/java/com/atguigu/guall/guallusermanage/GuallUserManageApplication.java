package com.atguigu.guall.guallusermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.atguigu.guall.guallusermanage.mapper")
@SpringBootApplication
public class GuallUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuallUserManageApplication.class, args);
    }

}
