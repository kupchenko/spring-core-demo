package me.kupchenko.ex7.post.processor.proxy;

import me.kupchenko.ex7.post.processor.proxy.service.Ex7Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

//jvisualvm
//From java 9 https://visualvm.github.io/download.html
//Install VisualVM-MBeans
public class PostProcessorProxy {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.kupchenko.ex7");
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        Ex7Service bean = context.getBean(Ex7Service.class); //Try Ex7Service impl and getClass
        System.out.println(bean.getClass());
        while (true) {
            bean.method();
        }
    }
}


//Proxy: Spring AOP(Aspects) работает через прокси:
//        ●	Dynamic PROXY - через интерфейсы
//        ●	CGLib - наследование от проксируемого класса
