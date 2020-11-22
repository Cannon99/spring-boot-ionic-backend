package com.example.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.cursomc.services.DBService;
import com.example.cursomc.services.EmailService;
import com.example.cursomc.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
		if(strategy.equals("create")) {
			dbService.instantiateTestDatabase();
			return true;
		}
		
		return false;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}


