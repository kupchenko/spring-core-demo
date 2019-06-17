package me.kupchenko.ex11.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeSingletone {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex11");
        SingletoneBean bean = context.getBean(SingletoneBean.class);
        for (int i = 0; i < 10; i++) {
            bean.doSmth();
        }

    }
}