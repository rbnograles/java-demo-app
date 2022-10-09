package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

	private static final int PORT = 3000;
	private static final Logger log = LoggerFactory.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info("Server starts at port " + PORT);
	}
}
