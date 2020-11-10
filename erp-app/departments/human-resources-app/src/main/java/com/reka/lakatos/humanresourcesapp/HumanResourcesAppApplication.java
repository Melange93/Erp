package com.reka.lakatos.humanresourcesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HumanResourcesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanResourcesAppApplication.class, args);
	}
}