package me.kupchenko.ex8.listener;

import org.springframework.stereotype.Service;

@Service
public class Ex8Service {

    @PostProxy
    public void prepare() {
        System.out.println("Preparing ...");
    }
}
