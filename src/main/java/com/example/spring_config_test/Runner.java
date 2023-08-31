package com.example.spring_config_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {
    Customer c;
    PWGen g;
    String a;

    @Autowired
    ApplicationContext applicationContext;

    Runner(@Qualifier("temporary") Customer c, PWGen g, String address1) {
        System.out.println("Started Runner");
        this.g = g;
        this.c = c;
        this.a = address1;
    }
    @Override
    public void run(String... args) {
        System.out.println("Hello, Spring!");
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        System.out.println(c);
        System.out.println(g.generate());
        System.out.println(a);
    }
}
