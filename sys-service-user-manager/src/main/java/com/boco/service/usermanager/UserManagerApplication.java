package com.boco.service.usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients //开始feignClient
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.boco.framework.model.user")
@ComponentScan(basePackages = "com.boco.sys.service.api")
@ComponentScan(basePackages = "com.boco.service.usermanager")
public class UserManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManagerApplication.class,args);
    }
}
