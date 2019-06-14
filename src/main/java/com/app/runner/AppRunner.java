package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner{

	@Value("${my.code}")
	private String scode;
	
	@Value("${my.message}")
	private String msg;
	
	@Value("${my.mode}")
	private String mode;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "AppRunner [scode=" + scode + ", msg=" + msg + ", mode=" + mode + "]";
	}

}
