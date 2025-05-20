package com.neils.infrastructure.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    private static final String AUTH_TOKEN = "Bearer apis-token-15139.r2Vp7T6Z7HCBI6gKWoH6DqibAH3b5D0v";

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("Authorization", AUTH_TOKEN);
    }
}
