package com.ianalfaro.webapp.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ianalfaro.webapp.biblioteca.system.Main;

import javafx.application.Application;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		//Levanta JAVAFX
		Application.launch(Main.class, args);
		//Levanta Springboot
		SpringApplication.run(BibliotecaApplication.class, args);
	}

}
