package service;

import database.document.EmployeeDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import database.repository.EmployeeRepository;
import service.domain.Employee;
import service.domain.EmployeeCreationContext;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public Employee addEmployee(EmployeeCreationContext employeeCreationContext) {
        final EmployeeDocument employeeDocument = new EmployeeDocument();

        employeeDocument.setName(employeeCreationContext.getName());
        employeeDocument.setBirthYear(employeeCreationContext.getBirthYear());

        final EmployeeDocument insertedEmployee = repository.insert(employeeDocument);

        return Employee.builder()
                .id(insertedEmployee.getId())
                .name(insertedEmployee.getName())
                .birthYear(insertedEmployee.getBirthYear())
                .build();
    }

    public boolean removeEmployee(String id) {
        Optional<EmployeeDocument> findEmployee = repository.findById(id);
        if (findEmployee.isPresent()) {
            repository.delete(findEmployee.get());
            return true;
        }
        return false;
    }

    public Employee updateEmployee(EmployeeCreationContext employeeCreationContext) {
        final EmployeeDocument employeeDocument = new EmployeeDocument();

        employeeDocument.setName(employeeCreationContext.getName());
        employeeDocument.setBirthYear(employeeCreationContext.getBirthYear());

        final EmployeeDocument savedEmployee = repository.save(employeeDocument);

        return Employee.builder()
                .name(savedEmployee.getName())
                .birthYear(savedEmployee.getBirthYear())
                .build();
    }

    public Employee getOldestPerson() {
        EmployeeDocument oldestEmployee = repository.findEmployeeByOrderByBirthYearDescIdAsc();
        return Employee.builder()
                .name(oldestEmployee.getName())
                .birthYear(oldestEmployee.getBirthYear())
                .build();
    }

    public List<Employee> getEmployees() {
        List<EmployeeDocument> employeeDocuments = repository.findAll();
        return employeeDocuments.stream()
                .map(employeeDocument -> Employee.builder()
                        .name(employeeDocument.getName())
                        .birthYear(employeeDocument.getBirthYear())
                        .build())
                .collect(Collectors.toList());
    }
}
