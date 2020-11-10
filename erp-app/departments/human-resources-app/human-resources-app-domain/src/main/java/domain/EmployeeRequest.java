package domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeRequest {

    private final String name;
    private final int birthYear;
}
