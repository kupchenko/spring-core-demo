package me.kupchenko.ex12.lookup.abst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeSingletone {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex12");
        SingletoneBean bean = context.getBean(SingletoneBean.class);
        for (int i = 0; i < 10; i++) {
            bean.doSmth();
        }
    }
}