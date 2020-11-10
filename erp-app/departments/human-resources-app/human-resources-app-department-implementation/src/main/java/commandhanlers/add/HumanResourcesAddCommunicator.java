package commandhanlers.add;

import domain.Employee;
import domain.EmployeeRequest;
import domain.EmployeeResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HumanResourcesAddCommunicator {

    private static final String ADD_URL = "/employee/add";
    private final RestTemplate restTemplate;

    public HumanResourcesAddCommunicator(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public EmployeeResponse registerNewEmployee(Employee employee) {
        EmployeeRequest request = EmployeeRequest.builder()
                .name(employee.getName())
                .birthYear(employee.getBirthYear())
                .build();

        return restTemplate.postForObject(ADD_URL, request, EmployeeResponse.class);
    }


}
