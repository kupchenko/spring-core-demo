package me.kupchenko.ex1.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class Context {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ex1.xml");
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------------------");
        context = new AnnotationConfigApplicationContext("me.kupchenko.ex1");
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
