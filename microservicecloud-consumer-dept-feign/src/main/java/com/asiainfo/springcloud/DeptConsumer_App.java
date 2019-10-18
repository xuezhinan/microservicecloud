package com.asiainfo.springcloud;


import com.asiainfo.myrule.MySelfRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableFeignClients(basePackages = "com.asiainfo.springcloud")
//@ComponentScan("com.asiainfo.springcloud")
public class DeptConsumer_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App.class,args);
    }
}
