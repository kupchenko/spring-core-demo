package me.kupchenko.ex5.javax.annotations;

import org.springframework.stereotype.Component;

@Component
public class Ex5AnotherService {
    public void printSmth() {
        System.out.println("We are invoking AnotherService");
    }
}