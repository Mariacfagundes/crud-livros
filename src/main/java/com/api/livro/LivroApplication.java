package com.api.livro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class LivroApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivroApplication.class, args);
	}

}
