package com.saitej.core.connections;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySQLConnection {
	
	public MySQLConnection() {
		System.out.println("MySQLConnection.MySQLConnection()");
	}
	
	

}
