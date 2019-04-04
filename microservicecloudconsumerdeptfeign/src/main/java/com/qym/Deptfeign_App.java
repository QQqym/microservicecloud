package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qiuyuming
 * @Date: 2019/4/2 13:01
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.qym"})
@ComponentScan("com.qym")
public class Deptfeign_App {
    public static void main(String[] args){
        SpringApplication.run(Deptfeign_App.class,args);
    }
}
