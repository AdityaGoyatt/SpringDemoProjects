package com.firstspringprojecte.demo.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		//must add /actuator before to access actuator endpoints.
		SpringApplication.run(SpringprojectApplication.class, args);
	}
}
