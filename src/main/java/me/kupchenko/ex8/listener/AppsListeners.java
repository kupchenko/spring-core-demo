package me.kupchenko.ex8.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppsListeners {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex8");

    }
}