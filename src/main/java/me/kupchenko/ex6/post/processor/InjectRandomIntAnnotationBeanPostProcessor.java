package me.kupchenko.ex6.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.stream.Stream;

@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcess_Before_Initialization");
        Stream.of(bean.getClass().getDeclaredFields())
                .filter(this::isAnnotationInjectRandomIntPresent)
                .forEach(field -> {
                    field.setAccessible(true);
                    InjectRandomInit annotation = field.getAnnotation(InjectRandomInit.class);
                    int min = annotation.min();
                    int max = annotation.max();
                    Random random = new Random();
                    int randomNumber = random.nextInt((max - min) + 1) + min;
                    ReflectionUtils.setField(field, bean, randomNumber);
                });
        return bean;
    }

    private boolean isAnnotationInjectRandomIntPresent(Field field) {
        return field.isAnnotationPresent(InjectRandomInit.class);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcess_After_Initialization");
        return bean;
    }
}
