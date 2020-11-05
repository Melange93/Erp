package log;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public abstract class Department {

    private final String departmentName;
    private final List<String> menuCommands;

    public abstract void command(String command);
}
