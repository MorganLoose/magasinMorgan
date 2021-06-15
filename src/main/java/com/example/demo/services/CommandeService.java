package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Commande;
import com.example.demo.repositories.CommandeRepository;

public class CommandeService {

	private JpaRepository<Commande, Integer> repository;

	public CommandeService(JpaRepository<Commande, Integer> repository) {
		this.repository = repository;
	}

	@Autowired
	CommandeRepository commandeRepository;

	public List<Commande> findAll() {
		return this.commandeRepository.findAll();
	}

	public Optional<Commande> findById(int id) {
		return this.commandeRepository.findById(id);
	}

	public Commande save(Commande commande) {
		return this.commandeRepository.save(commande);
	}

	public Commande update(int id, Commande commande) {
		return this.commandeRepository.save(commande);

	}

	public void delete(int id) {
		this.commandeRepository.deleteById(id);
	};
}
