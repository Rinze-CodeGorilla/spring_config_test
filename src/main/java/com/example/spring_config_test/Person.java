package com.example.spring_config_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
}

