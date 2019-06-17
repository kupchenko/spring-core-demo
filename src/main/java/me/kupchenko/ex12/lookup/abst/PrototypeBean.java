package me.kupchenko.ex12.lookup.abst;

import java.util.Random;

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
