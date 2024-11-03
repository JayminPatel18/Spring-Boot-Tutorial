package com.test.myApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    private Laptop laptop;

    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        this.laptop.compile();
        System.out.println("Working on Awesome Project");
    }

}
