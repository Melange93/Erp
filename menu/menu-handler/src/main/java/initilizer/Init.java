package initilizer;

import handler.MenuHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Init implements CommandLineRunner {

    private final MenuHandler menuHandler;

    @Override
    public void run(String... args) {
        System.out.println("HELLO WORD");
        menuHandler.start();
    }
}
