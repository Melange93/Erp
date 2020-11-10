package com.reka.lakatos.departmentregistryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DepartmentRegistryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentRegistryAppApplication.class, args);
	}

}
