package com.example.spring_config_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class SpringConfigTestApplication implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    PWGen pwg;

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigTestApplication.class, args);
    }

    public SpringConfigTestApplication() {
        System.out.println("Starting application");
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("AppReady");
        System.out.println("Het wachtwoord is %s".formatted(pwg.generate()));
    }
}
