package com.rituraj.simpleSpringApp;


import com.rituraj.simpleSpringApp.controller.Home;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleSpringAppApplication {
	public static final Logger logger = LoggerFactory.getLogger(SimpleSpringAppApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome");
		ApplicationContext context = (ApplicationContext) SpringApplication.run(SimpleSpringAppApplication.class, args);
		logger.debug("Checking context : {}", context.getBean(Home.class));

	}

}
