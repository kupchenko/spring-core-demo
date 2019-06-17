package me.kupchenko.ex10.profile;

import me.kupchenko.ex10.profile.service.Ex10Service;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private Ex10Service service;

    public Controller(Ex10Service service) {
        this.service = service;
    }

    public void doSmth() {
        service.print();
    }
}
