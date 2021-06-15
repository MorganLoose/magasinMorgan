package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repositories.CategorieRepository;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.CommandeRepository;
import com.example.demo.repositories.ProduitRepository;
import com.example.demo.services.CategorieService;
import com.example.demo.services.ClientService;
import com.example.demo.services.CommandeService;
import com.example.demo.services.ProduitService;

@Configuration
public class ServiceConfig {

	@Bean
	public ClientService clientServiceFactory(ClientRepository clientRepository) {
		return new ClientService(clientRepository);
	}

	@Bean
	public CommandeService commandeServiceFactory(CommandeRepository commandeRepository) {
		return new CommandeService(commandeRepository);
	}

	@Bean
	public ProduitService produitServiceFactory(ProduitRepository produitRepository) {
		return new ProduitService(produitRepository);
	}

	@Bean
	public CategorieService Categorie(CategorieRepository categorieRepository) {
		return new CategorieService(categorieRepository);
	}
}
