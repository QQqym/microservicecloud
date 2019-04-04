package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: qiuyuming
 * @Date: 2019/3/29 15:07
 * @Description:
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
