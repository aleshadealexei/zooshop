package ru.zooshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.zooshop.domain.FarmAnimal;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        FarmAnimal animal = new FarmAnimal();
        SpringApplication.run(Application.class, args);
    }

}
