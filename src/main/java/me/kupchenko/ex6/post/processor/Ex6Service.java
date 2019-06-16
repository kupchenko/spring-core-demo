package me.kupchenko.ex6.post.processor;

import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Getter
public class Ex6Service implements InitializingBean {
    @InjectRandomInit(min = 3, max = 21)
    private int randomNumber;

    public Ex6Service() {
        System.out.println("Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("INIT");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
