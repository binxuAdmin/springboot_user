package com.itheima;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient//客户端注册到  微服务注册到Eureka Server
//@EnableCircuitBreaker //开启熔断器
@SpringCloudApplication //代替三个注解
@EnableFeignClients//打开feign
public class ItheimaServiceConsourseApplication {
   /* @Bean
    @LoadBalanced //负载ribbon 轮巡
       public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/


    public static void main(String[] args) {
        SpringApplication.run(ItheimaServiceConsourseApplication.class, args);
    }

}
