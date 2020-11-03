package com.reka.lakatos.erp.log;

import org.springframework.http.HttpMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanResourcesDepartment extends Department {

    private static final String NAME = "Human Resources";
    private static final List<MenuPointInformation> MENU_POINT_INFORMATION = getMenuPointInformation();

    public HumanResourcesDepartment() {
        super(MENU_POINT_INFORMATION, NAME);
    }

    public static List<MenuPointInformation> getMenuPointInformation() {
        return new ArrayList<>(
                Arrays.asList(
                        new MenuPointInformation("Display table", "/employee/employees", HttpMethod.GET),
                        new MenuPointInformation("Add", "/employee/add", HttpMethod.POST),
                        new MenuPointInformation("Remove", "/employee/remove", HttpMethod.DELETE),
                        new MenuPointInformation("Update", "/employee/update", HttpMethod.PATCH),
                        new MenuPointInformation("Oldest person", "employee/oldestperson", HttpMethod.GET)
                )
        );
    }
}
