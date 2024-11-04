package com.test.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    // instance variable
//    @Autowired  // field Injection
    private Laptop laptop;
    @Autowired
    @Qualifier("laptop")
    private Computer comp;
//
//    // 2 create constructor
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    // it set method
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build() {
//         laptop.compile();
        comp.compile();    // using this keyword
        System.out.println("Working on Awesome Project");
    }

}
