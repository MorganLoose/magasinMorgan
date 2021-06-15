package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Client;
import com.example.demo.services.ClientService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("clients")
@CrossOrigin

public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping
	public List<Client> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Optional<Client> findById(@PathVariable int id) {
		return service.findById(id);
	}

	@PostMapping
	public Client save(@RequestBody Client client) {
		return service.save(client);
	}

	@DeleteMapping
	public void delete(@RequestBody Client client) {
		service.delete(client.getId());
	}
}
