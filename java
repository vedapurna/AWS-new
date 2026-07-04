package com.example;

import java.time.LocalDateTime;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Jenkins CI/CD Demo");
        System.out.println("=================================");
        System.out.println("Application Started");
        System.out.println("Current Time : " + LocalDateTime.now());
        System.out.println("Welcome to Jenkins + GitHub + Maven");
        System.out.println("Build Status : SUCCESS");
        System.out.println("=================================");
    }
}
