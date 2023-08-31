package com.example.spring_config_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

//        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println((String.join("\n", context.getBeanDefinitionNames())));
        var p1 = context.getBean(Person.class);
        var p2 = context.getBean("personMary");
        var p3 = context.getBean("personMary", Person.class);
        var ps = new Object[]{p1, p2, p3};
        Arrays.stream(ps).forEach(o -> System.out.println(o.getClass()));
    }
}

