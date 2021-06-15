package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repositories.ClientRepository;
import com.example.demo.services.ClientService;

@Configuration
public class ServiceConfig {

	@Bean
	public ClientService clientServiceFactory(ClientRepository clientRepository) {
		return new ClientService(clientRepository);
	}
}
