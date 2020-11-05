package domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Employee {

    private final String name;
    private final int birthYear;
}
