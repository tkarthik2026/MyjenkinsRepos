package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.example")
public class DemoSpringJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringJenkinsApplication.class, args);
	}

}

