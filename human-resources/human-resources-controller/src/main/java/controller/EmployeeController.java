package controller;

import domain.EmployeeRequest;
import domain.EmployeeResponse;
import service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.domain.Employee;
import service.domain.EmployeeCreationContext;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public EmployeeResponse addNewEmployee(@RequestBody EmployeeRequest employeeRequest) {
        Employee employee = employeeService.addEmployee(
                EmployeeCreationContext.builder()
                        .name(employeeRequest.getName())
                        .birthYear(employeeRequest.getBirthYear())
                        .build()
        );

        return EmployeeResponse.builder()
                .id(employee.getId())
                .name(employee.getName())
                .birthYear(employee.getBirthYear())
                .build();
    }

    @DeleteMapping("/remove")
    public String removeEmployeeById(@RequestParam String employeeId) {
        return employeeService.removeEmployee(employeeId) ? "Removal was successful." : "Removal was failed.";
    }

    @PatchMapping("/update")
    public EmployeeResponse updateEmployee(@RequestBody EmployeeRequest employeeRequest) {
        Employee employee = employeeService.updateEmployee(
                EmployeeCreationContext.builder()
                .name(employeeRequest.getName())
                .birthYear(employeeRequest.getBirthYear())
                .build()
        );

        return EmployeeResponse.builder()
                .id(employee.getId())
                .name(employee.getName())
                .birthYear(employee.getBirthYear())
                .build();
    }

    @GetMapping("/oldestperson")
    public EmployeeResponse getOldestPerson() {
        Employee oldestPerson = employeeService.getOldestPerson();
        return EmployeeResponse.builder()
                .id(oldestPerson.getId())
                .name(oldestPerson.getName())
                .birthYear(oldestPerson.getBirthYear())
                .build();
    }

    @GetMapping("/employees")
    public List<EmployeeResponse> getEmployees() {
        List<Employee> employees = employeeService.getEmployees();
        return employees.stream()
                .map(employee -> EmployeeResponse.builder()
                        .id(employee.getId())
                        .name(employee.getName())
                        .birthYear(employee.getBirthYear())
                        .build())
                .collect(Collectors.toList());
    }
}
