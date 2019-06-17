package me.kupchenko.ex9.qualifier;

import me.kupchenko.ex9.qualifier.service.Ex9Service;
import org.springframework.stereotype.Component;

@Component
public class SecondController {
    private Ex9Service secondService;

    public SecondController(Ex9Service secondService) {
        this.secondService = secondService;
    }

    public void doSmth() {
        secondService.print();
    }
}
