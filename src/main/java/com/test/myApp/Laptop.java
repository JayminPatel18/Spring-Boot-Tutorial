package com.test.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public Laptop() {
    }

    public void compile() {
        System.out.println("Compiling with 404 Error");
    }
}
