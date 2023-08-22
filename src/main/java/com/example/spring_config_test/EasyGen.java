package com.example.spring_config_test;

public class EasyGen implements PWGen {
    @Override
    public String generate() {
        return "welkom01";
    }

    public EasyGen() {
        System.out.println("Starting EasyGen");
    }
}
