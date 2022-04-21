package com.saitej.core.connections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
	
	
	@Value("${db.url:localhost}")
	private String dbUrl;
	
	
	public String getDbUrl() {
		return dbUrl;
	}
	
	

}
