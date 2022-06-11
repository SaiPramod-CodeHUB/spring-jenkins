package com.authserverexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("testing");
        SpringApplication.run(DemoApplication.class, args);
    }

}
