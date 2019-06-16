package me.kupchenko.ex4.context.annotations;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ex4AnotherService {
    public void printSomething() {
        System.out.println("Opt C: Some logic!!");
    }
}
