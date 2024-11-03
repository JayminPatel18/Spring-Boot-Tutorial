package com.test.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    // 1 @Autowired  // field Injection

    // instance variable
    private Laptop laptop;

    // 2 create constructor
    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        this.laptop.compile();    // using this keyword
        System.out.println("Working on Awesome Project");
    }

}
