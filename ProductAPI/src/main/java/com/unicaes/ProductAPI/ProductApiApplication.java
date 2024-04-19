package com.unicaes.ProductAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Swagger UI: http://localhost:8080/");
	}
}
