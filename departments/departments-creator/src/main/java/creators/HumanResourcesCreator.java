package creators;

import com.google.common.collect.Lists;
import department.HumanResourcesDepartment;
import domain.DepartmentResponse;

import java.util.List;

public class HumanResourcesCreator {
    private static final String HUMAN_RESOURCES_NAME = "Human Resources";
    private static final List<String> MENU_COMMANDS = Lists.newArrayList(
            "Display table",
            "Add",
            "Remove",
            "Update",
            "Oldest person"
    );

    public static DepartmentResponse getHumanResourcesDepartment() {
        HumanResourcesDepartment hrDepartment = new HumanResourcesDepartment(HUMAN_RESOURCES_NAME, MENU_COMMANDS);
        return DepartmentResponse.builder()
                .departmentName(hrDepartment.getDepartmentName())
                .menuCommands(hrDepartment.getMenuCommands())
                .build();
    }
}
