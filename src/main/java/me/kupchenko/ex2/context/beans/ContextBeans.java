package me.kupchenko.ex2.context.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextBeans {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ex2.xml");
        Ex2SomeService bean = context.getBean(Ex2SomeService.class);
        bean.doSmth();
    }
}
