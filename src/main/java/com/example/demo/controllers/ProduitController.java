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

import com.example.demo.models.Produit;
import com.example.demo.services.ProduitService;

@RestController
@RequestMapping("produits")
@CrossOrigin
public class ProduitController {

	@Autowired
	private ProduitService service;

	@GetMapping
	public List<Produit> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Optional<Produit> findById(@PathVariable int id) {
		return service.findById(id);
	}

	@PostMapping
	public Produit save(@RequestBody Produit produit) {
		return service.save(produit);
	}

	@DeleteMapping
	public void delete(@RequestBody Produit produit) {
		service.delete(produit.getId());
	}
}
