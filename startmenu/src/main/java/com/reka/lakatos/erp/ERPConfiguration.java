package com.reka.lakatos.erp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Scanner;

@Configuration
public class ERPConfiguration {

    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
