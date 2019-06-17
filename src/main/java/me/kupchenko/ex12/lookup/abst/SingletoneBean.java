package me.kupchenko.ex12.lookup.abst;

public abstract class SingletoneBean {
    public abstract PrototypeBean prototypeBean();

    public void doSmth() {
        int number = prototypeBean().getNumber();
        System.out.println("Number is " + number);
    }
}
