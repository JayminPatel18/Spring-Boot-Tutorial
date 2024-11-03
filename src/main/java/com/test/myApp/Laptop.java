package com.test.myApp;

import org.springframework.stereotype.Component;

@Component           // it managed below class to access method from another java file(myAppApplication)
public class Laptop {
    public Laptop() {
    }

    public void compile() {
        System.out.println("Compiling with 404 Error");
    }
}
