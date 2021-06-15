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

import com.example.demo.models.Categorie;
import com.example.demo.services.CategorieService;
import com.example.demo.services.CommandeService;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategorieController {

	@Autowired
	private CategorieService service;

	@GetMapping
	public List<Categorie> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Optional<Categorie> findById(@PathVariable int id) {
		return service.findById(id);
	}

	@PostMapping
	public Categorie save(@RequestBody Categorie categorie) {
		return service.save(categorie);
	}

	@DeleteMapping
	public void delete(@RequestBody Categorie categorie) {
		service.delete(categorie.getId());
	}
}
