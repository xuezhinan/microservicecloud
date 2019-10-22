package com.asiainfo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient  //将服务注册进eureka
@EnableDiscoveryClient  //发现服务
@EnableCircuitBreaker //对hystrix熔断机制的支持
public class DeptProvider_App_hystrix {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_App_hystrix.class,args);
    }
}
