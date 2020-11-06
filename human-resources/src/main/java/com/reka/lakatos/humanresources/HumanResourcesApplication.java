package com.reka.lakatos.humanresources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
public class HumanResourcesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(com.reka.lakatos.humanresources.HumanResourcesApplication.class, args);

		SpringApplication app = new SpringApplication(HumanResourcesApplication.class);
		app.setDefaultProperties(settings());
		app.run(args);
	}

	public static Map<String, Object> settings() {
		return Map.ofEntries(
				Map.entry("server.port", "8083"),
				Map.entry("spring.application.name", "human-resources")
		);
	}
}