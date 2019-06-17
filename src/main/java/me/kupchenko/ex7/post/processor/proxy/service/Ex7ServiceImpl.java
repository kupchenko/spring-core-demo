package me.kupchenko.ex7.post.processor.proxy.service;

import me.kupchenko.ex7.post.processor.proxy.bpp.Profiling;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Profiling
public class Ex7ServiceImpl implements Ex7Service {
    public void method() {
        int min = 3;
        int max = 7;
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        try {
            System.out.println("Working...");
            Thread.sleep(100 * randomNumber);
        } catch (InterruptedException e) {
            //not TODO
        }

    }
}
