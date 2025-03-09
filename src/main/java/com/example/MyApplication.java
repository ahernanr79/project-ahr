package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

	@RequestMapping("/")
	String home() {
		return "This is a spring boot application. Testing the deployment on AWS using CodePipeline. HAVE A GREAT DAY!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}