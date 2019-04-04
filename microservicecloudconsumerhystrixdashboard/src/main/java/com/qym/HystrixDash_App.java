package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qiuyuming
 * @Date: 2019/4/2 13:01
 * @Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDash_App {
    public static void main(String[] args){
        SpringApplication.run(HystrixDash_App.class,args);
    }
}
