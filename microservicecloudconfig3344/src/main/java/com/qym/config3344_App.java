package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: qiuyuming
 * @Date: 2019/4/2 13:01
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class config3344_App {
    public static void main(String[] args){
        SpringApplication.run(config3344_App.class,args);
    }
}
