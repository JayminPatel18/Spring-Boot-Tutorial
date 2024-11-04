package com.test.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component           // it managed below class to access method from another java file(myAppApplication)
//@Primary   // it accees first when implemnt same interface
public class Desktop implements Computer {
    public Desktop() {
    }

    public void compile() {
        System.out.println("Compiling with 404 Error but Faster");
    }
}
