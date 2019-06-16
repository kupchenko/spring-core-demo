package me.kupchenko.ex3.context.mix;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ex3SomeService {
    @Value("${message}")
    private String message;

    //    Inject with no setter, no Constructor and no @Autowire??

    //@Autowired //NOT RECOMMENDED!!!
    private Ex3AnotherService optBAnotherService;

//    @Autowired // optional
//    public OptBSomeService(OptBAnotherService optBAnotherService) {
//        this.optBAnotherService = optBAnotherService;
//    }

    @Autowired // not optional
    public void setOptBAnotherService(Ex3AnotherService optBAnotherService) {
        this.optBAnotherService = optBAnotherService;
    }

    public void doSmth() {
        System.out.println("Message: " + message);
        optBAnotherService.printSomething();
    }


}
