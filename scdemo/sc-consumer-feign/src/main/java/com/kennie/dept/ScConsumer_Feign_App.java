package com.kennie.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.kennie"})
//@ComponentScan("com.kennie")
public class ScConsumer_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(ScConsumer_Feign_App.class,args);
    }
}
