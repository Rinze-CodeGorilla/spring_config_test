package com.example.spring_config_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.example.spring_config_test")
@Configuration
public class Config {

    @Bean
    public Person personMary() {
        return new Person("Mary");
    }
}
