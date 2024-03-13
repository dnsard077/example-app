package com.example.exampleapp;

import com.example.exampleapp.service.AppMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleAppApplication implements CommandLineRunner {
	@Autowired
	AppMenu appMenu;

	public static void main(String[] args) {
		SpringApplication.run(ExampleAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		appMenu.initMenu();
	}
}
