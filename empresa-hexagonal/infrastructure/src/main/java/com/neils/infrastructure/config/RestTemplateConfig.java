package com.neils.infrastructure.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    private static final String AUTH_TOKEN = "Bearer apis-token-15139.r2Vp7T6Z7HCBI6gKWoH6DqibAH3b5D0v";

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((request, body, execution) -> {
            request.getHeaders().add("Authorization", AUTH_TOKEN);
            return execution.execute(request, body);
        });
        return restTemplate;
    }

}
