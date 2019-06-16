package me.kupchenko.ex6.post.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostProcessors {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex6");
        Ex6Service bean = context.getBean(Ex6Service.class);
        System.out.println("Number is " + bean.getRandomNumber());
    }
}
