package com.reka.lakatos.humanresources.controller;

import com.reka.lakatos.humanresources.document.Employee;
import com.reka.lakatos.humanresources.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addNewEmployee(@RequestBody Employee employee) {
       return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/remove")
    public String removeEmployeeById(@RequestParam String employeeId) {
        return employeeService.removeEmployee(employeeId) ? "Removal was successful." : "Removal was failed.";
    }

    @PatchMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/oldestperson")
    public Employee getOldestPerson() {
        return employeeService.getOldestPerson();
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
