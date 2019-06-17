package me.kupchenko.ex9.qualifier.service;

import org.springframework.stereotype.Service;

@Service
public class SecondService implements Ex9Service {
    @Override
    public void print() {
        System.out.println("Print second service");
    }
}
