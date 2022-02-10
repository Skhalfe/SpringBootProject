package com.ttl.SpringBootJPACrudExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootJpaCrudExampleApplication {
	
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootJpaCrudExampleApplication.class, args);
	}

}
