package com.reka.lakatos.menuapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MenuAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuAppApplication.class, args);
    }
}
