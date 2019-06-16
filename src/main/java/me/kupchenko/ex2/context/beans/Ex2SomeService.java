package me.kupchenko.ex2.context.beans;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@RequiredArgsConstructor
public class Ex2SomeService {
    @Value("${message}")
    private String message;
    private final Ex2AnotherService anotherService;

    public void doSmth() {
        System.out.println("Message: " + message);
        anotherService.printSomething();
    }
}
