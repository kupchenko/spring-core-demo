package me.kupchenko.ex3.context.mix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class Ex3SomeService {
    @Value("${message}")
    private String message;

    //    Inject with no setter, no Constructor and no @Autowire??

//    @Autowired //NOT RECOMMENDED!!!
    private final Ex3AnotherService ex3AnotherService;

//    @Autowired // optional
//    public Ex3SomeService(Ex3AnotherService ex3AnotherService) {
//        this.ex3AnotherService = ex3AnotherService;
//    }
//
//    @Autowired // not optional
//    public void setOptBAnotherService(Ex3AnotherService ex3AnotherService) {
//        this.ex3AnotherService = ex3AnotherService;
//    }

    public void doSmth() {
        System.out.println("Message: " + message);
        ex3AnotherService.printSomething();
    }


}
