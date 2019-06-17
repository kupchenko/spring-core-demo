package me.kupchenko.ex11.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletoneBean {
    @Lookup
    public PrototypeBean prototypeBean() {
        return null;
    }

    public void doSmth() {
        int number = prototypeBean().getNumber();
        System.out.println("Number is " + number);
    }
}
