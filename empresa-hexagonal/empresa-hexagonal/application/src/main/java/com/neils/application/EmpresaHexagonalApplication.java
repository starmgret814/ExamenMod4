package com.neils.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.neils.application", "com.neils.infrastructure.adapters"})
public class EmpresaHexagonalApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpresaHexagonalApplication.class, args);
    }
}
