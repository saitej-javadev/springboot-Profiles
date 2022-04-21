package com.saitej.core.connections;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class OracleConnection {
	
	public OracleConnection() {
		System.out.println("OracleConnection.OracleConnection()");
	}

}
