package com.reka.lakatos.erp.log;

import lombok.Getter;
import org.springframework.http.HttpMethod;

@Getter
public class MenuPointInformation {
    private String name;
    private String endPoint;
    private HttpMethod httpMethod;

    public MenuPointInformation(String name, String endPoint, HttpMethod httpMethod) {
        this.name = name;
        this.endPoint = endPoint;
        this.httpMethod = httpMethod;
    }
}
