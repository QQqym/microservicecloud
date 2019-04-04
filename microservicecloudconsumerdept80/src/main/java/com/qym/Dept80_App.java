package com.qym;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qiuyuming
 * @Date: 2019/3/28 14:49
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients(basePackages= {"com.qym"})
//@ComponentScan("com.qym")
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class Dept80_App {
    public static void main(String[] args){
        SpringApplication.run(Dept80_App.class,args);
    }
}

