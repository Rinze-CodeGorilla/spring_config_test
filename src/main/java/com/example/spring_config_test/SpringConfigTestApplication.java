package com.example.spring_config_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@Component
public class SpringConfigTestApplication implements ApplicationListener<ApplicationReadyEvent> {

//    @Autowired
//    PWGen pwg;

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigTestApplication.class, args);
    }

    public SpringConfigTestApplication() {
        System.out.println("Starting application");
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("AppReady");
//        System.out.println("Het wachtwoord is %s".formatted(pwg.generate()));
    }

    @Bean
    public Customer customer(@Qualifier("address2") String address) {
        return new Customer("Clara Foster", address);
    }


    @Bean
    public Customer temporary(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }
}

class Customer {
    private final String name;
    private final String address;

    Customer(String name, String address) {
        System.out.println("Started Customer");
        this.name = name;
        this.address = address;
    }

    // getters

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

