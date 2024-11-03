package com.test.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public MyAppApplication() {
	}

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		//
		Dev obje = (Dev)context.getBean(Dev.class);
		obje.build();
	}

}
