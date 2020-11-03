package com.reka.lakatos.erp;

import com.reka.lakatos.erp.log.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor
public class MenuHandler {

    private final Scanner scanner;


    public void start() {

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        Map<String, String> map = new HashMap<>();
        map.put("id", null);
        map.put("name", "Andras");
        map.put("birthYear", "1994");


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Result> request = new HttpEntity<>(new Result(map), headers);

        Result body = restTemplate.exchange("http://localhost:8091/employee/add", HttpMethod.POST, request, Result.class).getBody();
        System.out.println(body);

        /*
        List<String> departmentsName = departments.values().stream()
                .map(Department::getName)
                .collect(Collectors.toList());
        departmentsName.add("Exit");
        int chosenDepartmentNumber = choseFromTheList(departmentsName);
        if (chosenDepartmentNumber == 0) {
            return;
        }
        chosenDepartment = departments.get(chosenDepartmentNumber);
        List<String> menuPoints = chosenDepartment.getMenuPoints();
        menuPoints.add("Back");
        int option = choseFromTheList(menuPoints);
        System.out.println(option);

         */
    }

    public int choseFromTheList(List<String> menuPoints) {
        String choice;
        do {
            IntStream.range(0, menuPoints.size())
                    .forEach(i -> System.out.printf("%d %s%n", i, menuPoints.get(i)));
            choice = scanner.nextLine();
        } while (Integer.parseInt(choice) < 0 || Integer.parseInt(choice) > menuPoints.size());
        return Integer.parseInt(choice);
    }

}
