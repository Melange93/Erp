package com.reka.lakatos.menuapp.initilizer;

import com.reka.lakatos.menuapp.handler.MenuHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Init implements CommandLineRunner {

    private final MenuHandler menuHandler = new MenuHandler();

    @Override
    public void run(String... args) {
        System.out.println("HELLO WORD");
        menuHandler.start();
    }
}
