package me.kupchenko.ex12.lookup.abst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Ex12Config {

    @Bean
    public SingletoneBean getSingletoneBean() {
        return new SingletoneBean() {
            @Override
            public PrototypeBean prototypeBean() {
                return getPrototypeBean();
            }
        };
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean getPrototypeBean() {
        return new PrototypeBean();
    }
}
