package service.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeCreationContext {

    private final String name;
    private final int birthYear;
}
