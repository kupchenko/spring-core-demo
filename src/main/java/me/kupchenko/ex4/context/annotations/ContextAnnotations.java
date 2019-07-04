package me.kupchenko.ex4.context.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex4");
        Ex4SomeService bean = context.getBean(Ex4SomeService.class);
        bean.doSmth();
    }
}
