package me.kupchenko.ex5.javax.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class JavaxAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex5");
        Ex5Service bean = context.getBean(Ex5Service.class);
        bean.doSmth();
    }
}
