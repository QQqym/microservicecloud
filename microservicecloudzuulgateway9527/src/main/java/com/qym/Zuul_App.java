package com.qym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: qiuyuming
 * @Date: 2019/4/2 13:01
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_App {
    public static void main(String[] args){
        SpringApplication.run(Zuul_App.class,args);
    }
}
