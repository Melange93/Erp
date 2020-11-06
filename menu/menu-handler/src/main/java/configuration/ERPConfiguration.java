package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Configuration
public class ERPConfiguration {

    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    /*
    @Bean
    public List<DepartmentResponse> getDepartments() {
        return DepartmentListCreator.getDepartments();

    @Bean
    public List<String> getDepartmentsNames() {
       return getDepartments().stream()
               .map(departmentResponse -> departmentResponse.)
               .collect(Collectors.toList());
    }

     */

}
