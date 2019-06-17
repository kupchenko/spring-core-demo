package me.kupchenko.ex10.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//-Dspring.profiles.active=local
public class Profiles {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex10");
        Controller bean = context.getBean(Controller.class);
        bean.doSmth();

    }
}