package com.github.marcosws.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoListBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListBackendApplication.class, args);
	}
	
	/*
	 * H2:      http://localhost:8080/h2-console/
	 * jdbc url: jdbc:h2:mem:tododb
	 * 
	 * APP:     http://localhost:8080/
	 * 
	 * */
}
