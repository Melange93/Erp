package database.repository;

import database.document.EmployeeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeDocument, String> {

    EmployeeDocument findEmployeeByOrderByBirthYearDescIdAsc();
}
