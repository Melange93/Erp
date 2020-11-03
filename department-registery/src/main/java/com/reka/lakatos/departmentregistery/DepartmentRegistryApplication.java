package com.reka.lakatos.departmentregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DepartmentRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentRegistryApplication.class, args);
	}

}
