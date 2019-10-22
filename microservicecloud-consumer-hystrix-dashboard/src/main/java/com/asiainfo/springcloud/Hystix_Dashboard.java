package com.asiainfo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard // 开启监控
public class Hystix_Dashboard {
    public static void main(String[] args) {
        SpringApplication.run(Hystix_Dashboard.class,args);
    }
}
