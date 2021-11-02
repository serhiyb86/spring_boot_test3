package com.springDI.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config.xml")
public class Task3Application {

	public static void main(String[] args) {
		SpringApplication.run(Task3Application.class, args);
	}

}
