package com.reka.lakatos.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ZuulApplication.class, args);

        SpringApplication app = new SpringApplication(ZuulApplication.class);
        app.setDefaultProperties(settings());
        app.run(args);
    }

    public static Map<String, Object> settings() {
        return Map.ofEntries(
                Map.entry("server.port", "8762"),
                Map.entry("spring.application.name", "startmenu")
        );
    }

}
