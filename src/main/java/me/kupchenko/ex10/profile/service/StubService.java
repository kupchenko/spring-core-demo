package me.kupchenko.ex10.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class StubService implements Ex10Service {
    @Override
    public void print() {
        System.out.println("Print STUB service");
    }
}
