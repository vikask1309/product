package com.product.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.product.entity")
@EnableJpaRepositories("com.product.repository")
@ComponentScan("com.product")
public class SpringBootJpaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaLearningApplication.class, args);
	}

}
