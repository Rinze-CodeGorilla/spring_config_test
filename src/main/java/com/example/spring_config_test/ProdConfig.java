package com.example.spring_config_test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnProperty(
//        name = "environment",
//        havingValue = "prod"
//)
public class ProdConfig {
    @Bean
    public PWGen getGenerator() {
        return new HardGen();
    }

    public ProdConfig() {
        System.out.println("Started ProdConfig");
    }
}
