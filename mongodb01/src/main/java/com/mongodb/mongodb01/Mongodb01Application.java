package com.mongodb.mongodb01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.mongodb.mongodb01.controller","com.mongodb.mongodb01.entity","com.mongodb.mongodb01.repository"})
@EnableMongoRepositories(basePackages = {"com.mongodb.mongodb01.repository"})
public class Mongodb01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mongodb01Application.class, args);
	}
}



