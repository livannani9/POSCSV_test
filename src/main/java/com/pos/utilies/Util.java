package com.pos.utilies;

import java.io.InputStream;

public class Util {
	
	InputStream resourceAsStream =null;
	
	public Util() {
	
		resourceAsStream= this.getClass().getResourceAsStream("application.properties");
		}
		
		
	}

