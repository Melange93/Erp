package service.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Employee {

    private String id;
    private String name;
    private int birthYear;
}
