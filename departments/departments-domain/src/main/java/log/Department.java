package log;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class Department {

    private final String departmentName;
    private final List<String> menuCommands;

    public Department(String departmentName, List<String> menuCommands) {
        this.departmentName = departmentName;
        this.menuCommands = menuCommands;
    }

    public abstract void command(String command);
}
