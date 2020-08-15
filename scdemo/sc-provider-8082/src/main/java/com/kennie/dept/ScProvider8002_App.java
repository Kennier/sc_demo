package com.kennie.dept;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(ScProvider8002_App.class,args);
    }
}
