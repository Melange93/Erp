package com.reka.lakatos.erp.log;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class Department {

    private List<MenuPointInformation> menuPoints;
    private String departmentName;

    public Department(List<MenuPointInformation> menuPoints, String departmentName) {
        this.menuPoints = menuPoints;
        this.departmentName = departmentName;
    }
}
