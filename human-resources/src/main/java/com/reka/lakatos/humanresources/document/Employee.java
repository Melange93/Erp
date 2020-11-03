package com.reka.lakatos.humanresources.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("Employee")
@Getter
@Setter
@ToString
public class Employee {
    @Id
    private String id;
    private String name;
    private int birthYear;

    public Employee(String name, int birthYear) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.birthYear = birthYear;
    }
}
