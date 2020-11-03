package com.reka.lakatos.humanresources.repository;

import com.reka.lakatos.humanresources.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Employee findEmployeeByOrderByBirthYearDescIdAsc();
}
