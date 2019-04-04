package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: qiuyuming
 * @Date: 2019/4/1 10:20
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
