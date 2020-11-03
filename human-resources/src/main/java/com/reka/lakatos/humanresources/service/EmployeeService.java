package com.reka.lakatos.humanresources.service;

import com.reka.lakatos.humanresources.document.Employee;
import com.reka.lakatos.humanresources.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public Employee addEmployee(Employee employee) {
        return repository.insert(employee);
    }

    public boolean removeEmployee(String id) {
        Optional<Employee> findEmployee = repository.findById(id);
        if (findEmployee.isPresent()) {
            repository.delete(findEmployee.get());
            return true;
        }
        return false;
    }

    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee getOldestPerson() {
        return repository.findEmployeeByOrderByBirthYearDescIdAsc();
    }

    public List<Employee> getEmployees() {
        return repository.findAll();
    }
}
