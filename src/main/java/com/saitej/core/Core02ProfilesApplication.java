package com.saitej.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.saitej.core.connections.DBConnection;

@SpringBootApplication
public class Core02ProfilesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Core02ProfilesApplication.class, args);
		System.out.println(run.getBean(DBConnection.class).getDbUrl());
	}

}
