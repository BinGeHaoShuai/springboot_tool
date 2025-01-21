package com.example.springboot_tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@ServletComponentScan
@SpringBootApplication
@EnableFeignClients
public class SpringbootToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootToolApplication.class, args);
    }

}
