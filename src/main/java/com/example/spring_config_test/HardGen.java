package com.example.spring_config_test;

import java.util.Random;

public class HardGen implements PWGen {
    @Override
    public String generate() {
        var r = new Random();
        var sb = new StringBuilder();
        for (int i = 0; i < 10; i++)
            sb.append((char)r.nextInt('a', 'z'));
        return sb.toString();
    }

    public HardGen() {
        System.out.println("Starting Password Generator");
    }
}
