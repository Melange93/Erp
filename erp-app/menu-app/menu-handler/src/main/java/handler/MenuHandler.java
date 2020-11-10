package handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor
public class MenuHandler {
/*
    private final List<DepartmentResponse> departments;
    private final List<String> departmentsNames;
    private final Scanner scanner;
    private DepartmentResponse activeDepartment;

 */

    public void start() {
        System.out.println("hello");

        /*
        List<String> departmentsName = departmentsNames;
        int chosenDepartmentNumber = choseFromTheList(departmentsName);
        System.out.println(chosenDepartmentNumber);

         */
        /*
        String chosenDepartmentName = departmentsName.get(chosenDepartmentNumber);
        Department department = departments.get(chosenDepartmentName);
        List<String> menuCommands = department.getMenuCommands();
        int choseCommand = choseFromTheList(menuCommands);
        String command = menuCommands.get(choseCommand);
        department.command(command);

         */
    }
/*
    public int choseFromTheList(List<String> menuPoints) {
        String choice;
        do {
            IntStream.range(0, menuPoints.size())
                    .forEach(i -> System.out.printf("%d %s%n", i, menuPoints.get(i)));
            choice = scanner.nextLine();
        } while (Integer.parseInt(choice) < 0 || Integer.parseInt(choice) > menuPoints.size());
        return Integer.parseInt(choice);
    }

 */

}
