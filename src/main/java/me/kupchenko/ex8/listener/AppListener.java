package me.kupchenko.ex8.listener;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

@Component
@AllArgsConstructor
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {
    private ConfigurableListableBeanFactory factory;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        Stream.of(applicationContext.getBeanDefinitionNames())
                .map(factory::getBeanDefinition)
                .map(BeanDefinition::getBeanClassName)//original class name
                .map(this::getAllMethods)
                .flatMap(Stream::of)
                .filter(this::isAnnotationPostProxyPresent)
                .forEach(method -> {
                    Class<?> declaringClass = method.getDeclaringClass();
                    Object bean = applicationContext.getBean(declaringClass);
                    try {
                        Method currentMethod = bean.getClass().getMethod(method.getName(), method.getParameterTypes());
                        currentMethod.invoke(bean);
                    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    private boolean isAnnotationPostProxyPresent(Method method) {
        return method.isAnnotationPresent(PostProxy.class);
    }

    private Method[] getAllMethods(String originalClassName) {
        try {
            Class<?> originalClass = Class.forName(originalClassName);
            return originalClass.getDeclaredMethods();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
