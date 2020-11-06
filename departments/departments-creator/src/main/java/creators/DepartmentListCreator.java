package creators;

import com.google.common.collect.Lists;
import domain.DepartmentResponse;

import java.util.List;

public class DepartmentListCreator {
    private static final List<DepartmentResponse> DEPARTMENTS = Lists.newArrayList(
        HumanResourcesCreator.getHumanResourcesDepartment()
    );

    public static List<DepartmentResponse> getDepartments() {
        return DEPARTMENTS;
    }
}
