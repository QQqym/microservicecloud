package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: qiuyuming
 * @Date: 2019/3/28 10:13
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Dept8001_App {
    public static void main(String[] args){
        SpringApplication.run(Dept8001_App.class,args);
    }
}
