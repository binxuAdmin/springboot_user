package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.itheima.maper")//mapper的包扫描
@EnableDiscoveryClient
public class ItheimaServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItheimaServiceProviderApplication.class, args);
    }

}
