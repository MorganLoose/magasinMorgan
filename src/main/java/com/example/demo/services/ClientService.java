package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;

public class ClientService {

	private JpaRepository<Client, Integer> repository;

	public ClientService(JpaRepository<Client, Integer> repository) {
		this.repository = repository;
	}

	@Autowired
	ClientRepository clientRepository;

	public List<Client> findAll() {
		return this.clientRepository.findAll();
	}

	public Optional<Client> findById(int id) {
		return this.clientRepository.findById(id);
	}

	public Client save(Client client) {
		return this.clientRepository.save(client);
	}

	public Client update(int id, Client client) {
		return this.clientRepository.save(client);

	}

	public void delete(int id) {
		this.clientRepository.deleteById(id);
	};
}
