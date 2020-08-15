package com.kennie.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScEurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServer7001_App.class, args);
    }
}
