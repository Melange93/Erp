package configuration;

import com.google.common.collect.Lists;
import department.HumanResourcesDepartment;
import log.Department;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Configuration
public class ERPConfiguration {

    private static final String HUMAN_RESOURCES_NAME = "Human Resources";

    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Map<String, Department> getDepartments() {
        return Map.ofEntries(
                Map.entry(
                        HUMAN_RESOURCES_NAME,
                        new HumanResourcesDepartment(
                                HUMAN_RESOURCES_NAME,
                                getMenuCommandsByDepartmentName().get(HUMAN_RESOURCES_NAME)
                        )
                )
        );
    }

    private Map<String, List<String>> getMenuCommandsByDepartmentName() {
        return Map.ofEntries(
                Map.entry(
                        HUMAN_RESOURCES_NAME,
                        Lists.newArrayList(
                                "Display table",
                                "Add",
                                "Remove",
                                "Update",
                                "Oldest person"
                        )
                )
        );
    }

}
