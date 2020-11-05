package handler;

import log.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor
public class MenuHandler {

    private final Map<String, Department> departments;
    private final Scanner scanner;

    public void start() {

        List<String> departmentsName = new ArrayList<>(departments.keySet());
        departmentsName.add("Exit");
        int chosenDepartmentNumber = choseFromTheList(departmentsName);
        if (chosenDepartmentNumber == 0) {
            return;
        }
        String chosenDepartmentName = departmentsName.get(chosenDepartmentNumber);
        Department department = departments.get(chosenDepartmentName);
        List<String> menuCommands = department.getMenuCommands();
        int choseCommand = choseFromTheList(menuCommands);
        String command = menuCommands.get(choseCommand);
        department.command(command);
    }

    public int choseFromTheList(List<String> menuPoints) {
        String choice;
        do {
            IntStream.range(0, menuPoints.size())
                    .forEach(i -> System.out.printf("%d %s%n", i, menuPoints.get(i)));
            choice = scanner.nextLine();
        } while (Integer.parseInt(choice) < 0 || Integer.parseInt(choice) > menuPoints.size());
        return Integer.parseInt(choice);
    }

}
