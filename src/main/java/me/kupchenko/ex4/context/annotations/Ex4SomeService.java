package me.kupchenko.ex4.context.annotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ex4SomeService {
    @Value("${message}")
    private String message;
    private final Ex4AnotherService optCAnotherService;

    public void doSmth() {
        System.out.println("Message: " + message);
        optCAnotherService.printSomething();
    }
}
