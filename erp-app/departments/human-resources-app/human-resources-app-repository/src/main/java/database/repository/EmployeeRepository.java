package database.repository;

import database.document.EmployeeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDocument, String> {

    EmployeeDocument findEmployeeByOrderByBirthYearDescIdAsc();
}
