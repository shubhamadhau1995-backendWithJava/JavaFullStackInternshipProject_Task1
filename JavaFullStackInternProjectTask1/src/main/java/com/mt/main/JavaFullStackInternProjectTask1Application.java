package com.mt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mt")
public class JavaFullStackInternProjectTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaFullStackInternProjectTask1Application.class, args);
	}

}


