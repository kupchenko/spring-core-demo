package me.kupchenko.ex11.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class PrototypeBean {
    private int randomNumber;

    public PrototypeBean() {
        int min = 0;
        int max = 1000;
        Random random = new Random();
        randomNumber = random.nextInt((max - min) + 1) + min;
    }

    public int getNumber() {
        return randomNumber;
    }
}
