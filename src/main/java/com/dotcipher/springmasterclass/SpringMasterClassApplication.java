package com.dotcipher.springmasterclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringMasterClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMasterClassApplication.class, args);
	}
}