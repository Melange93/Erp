package domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class DepartmentResponse {

    private final String departmentName;
    private final List<String> menuCommands;

    public DepartmentResponse(String departmentName, List<String> menuCommands) {
        this.departmentName = departmentName;
        this.menuCommands = menuCommands;
    }

    //public abstract void command(String command);
}
