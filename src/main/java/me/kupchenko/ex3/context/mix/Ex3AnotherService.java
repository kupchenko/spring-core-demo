package me.kupchenko.ex3.context.mix;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ex3AnotherService {
    public void printSomething() {
        System.out.println("Some logic!!");
    }
}
