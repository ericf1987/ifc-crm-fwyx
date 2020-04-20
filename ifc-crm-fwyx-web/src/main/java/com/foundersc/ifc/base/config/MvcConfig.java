package com.foundersc.ifc.base.config;

import com.foundersc.ifc.crm.tools.exception.ExceptionHandleAdvice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by zxm on 2019/1/31.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public ExceptionHandleAdvice exceptionHandleAdvice(){
        return new ExceptionHandleAdvice();
    }
}
