package me.kupchenko.ex3.context.mix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

/**
 * Hello world!
 */
public class ContextMix {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ex3.xml");
        Ex3SomeService bean = context.getBean(Ex3SomeService.class);
        bean.doSmth();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
