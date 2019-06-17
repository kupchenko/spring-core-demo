package me.kupchenko.ex9.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Qualifiers {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex9");
        Controller bean = context.getBean(Controller.class);
        bean.doSmth();

    }
}