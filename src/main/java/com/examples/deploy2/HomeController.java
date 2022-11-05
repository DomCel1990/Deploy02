package com.examples.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {

    @GetMapping("/sum")
    public int getSum() {
        Random random = new Random();
        int a= random.nextInt();
        int b = random.nextInt();
        return a + b;
    }
}
