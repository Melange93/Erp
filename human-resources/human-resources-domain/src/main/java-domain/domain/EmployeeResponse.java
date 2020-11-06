package domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeResponse {

    private final String id;
    private final String name;
    private final int birthYear;
}
