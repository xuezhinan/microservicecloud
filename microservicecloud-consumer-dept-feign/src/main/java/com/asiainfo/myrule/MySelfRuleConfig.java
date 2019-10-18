package com.asiainfo.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个类和主启动类不能在同一包下也不能在其子包下，不能在@ComponentScan能扫描的包下
 *
 */

@Configuration
public class MySelfRuleConfig {

    @Bean
    public IRule myRule(){
        //return new RandomRule();//自定义使用随机访问策略
        return new MySelfRule();
    }
}
