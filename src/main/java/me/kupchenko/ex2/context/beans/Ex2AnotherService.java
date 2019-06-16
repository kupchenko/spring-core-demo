package me.kupchenko.ex2.context.beans;

import lombok.Data;

@Data
public class Ex2AnotherService {
    public void printSomething() {
        System.out.println("Opt A: Some logic!!");
    }
}
