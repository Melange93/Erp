package commandhanlers.add;

import domain.Employee;
import org.springframework.stereotype.Service;

import java.util.Scanner;
public class HumanResourcesAddScanner {

    private final Scanner scanner;

    public HumanResourcesAddScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee getAddRequestInformation() {
        String name = getName("Please give the Employee name.", 3, 60);
        int birthYear = getBirthYear();
        return Employee.builder()
                .name(name)
                .birthYear(birthYear)
                .build();
    }

    private String getName(String text, int minLength, int maxLength) {
        String input;
        do {
            System.out.printf("%s (The characters length need to be minimum %d and maximum %d)%n", text, minLength, maxLength);
            input = scanner.nextLine();
        } while (input != null
                && !input.equals("null")
                && !input.isBlank()
                && (input.length() < minLength || input.length() > maxLength)
        );
        return input;
    }

    private int getBirthYear() {
        int number;
        do {
            System.out.println("Please enter the birth year!");
            number = scanner.nextInt();
        } while (number <= 1900);
        return number;
    }
}
