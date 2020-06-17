package com.itheima.web;

import com.itheima.interceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//拦截器
@Configuration//配置的java
public class configration implements WebMvcConfigurer {
    @Autowired
    private Interceptor interceptor;
    public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(interceptor).addPathPatterns("/**");
    }
}
