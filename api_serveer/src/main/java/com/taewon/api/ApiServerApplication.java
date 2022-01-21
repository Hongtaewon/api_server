package com.taewon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiServeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiServeerApplication.class, args);
		
		System.out.println("테스트");
	}

}
