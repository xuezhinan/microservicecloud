package com.asiainfo.springcloud;


import com.asiainfo.myrule.MySelfRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//对名字为MICROSERVICECLOUD-DEPT的服务使用MySelfRule配置类自定义的配置的负载均衡策略
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRuleConfig.class)
public class DeptConsumer_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App.class,args);
    }
}
