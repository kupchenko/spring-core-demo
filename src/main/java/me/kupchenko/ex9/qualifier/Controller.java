package me.kupchenko.ex9.qualifier;

import lombok.AllArgsConstructor;
import me.kupchenko.ex9.qualifier.service.Ex9Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private Ex9Service service;

    public Controller(@Qualifier("firstService") Ex9Service service) {
        this.service = service;
    }

    public void doSmth() {
        service.print();
    }
}
