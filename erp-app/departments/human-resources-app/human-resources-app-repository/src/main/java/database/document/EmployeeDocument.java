package database.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Employee")
public class EmployeeDocument {

    @Id
    private String id;
    private String name;
    private int birthYear;
}
