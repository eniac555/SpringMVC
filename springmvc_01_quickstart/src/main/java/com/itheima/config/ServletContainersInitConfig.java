package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


//4.定义一个 Servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //加载springmvc容器配置
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(springMvcConfig.class);
        return context;
    }

    @Override
    protected String[] getServletMappings() {
        //设置哪些请求归属springMVC处理
        return new String[]{"/"};//表示所有请求
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        //加载spring容器
        return null;
    }
}
