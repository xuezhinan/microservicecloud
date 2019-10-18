package com.asiainfo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //将服务注册进eureka
@EnableDiscoveryClient  //发现服务
public class DeptProvider_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_App.class,args);
    }
}
