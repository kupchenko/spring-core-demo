package me.kupchenko.ex5.javax.annotations;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class Ex5Service {

    private Ex5AnotherService anotherService;

    @Inject
    public void setAnotherService(@Named("anotherService") Ex5AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public void doSmth() {
        anotherService.printSmth();
    }
}