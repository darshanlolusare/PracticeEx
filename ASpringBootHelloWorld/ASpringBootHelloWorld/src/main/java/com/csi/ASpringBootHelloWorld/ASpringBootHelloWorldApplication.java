package com.csi.ASpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "com.csi")
public class ASpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ASpringBootHelloWorldApplication.class, args);
	}

}
