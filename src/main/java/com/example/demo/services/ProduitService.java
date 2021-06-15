package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Commande;
import com.example.demo.models.Produit;
import com.example.demo.repositories.CommandeRepository;
import com.example.demo.repositories.ProduitRepository;

public class ProduitService {

	private JpaRepository<Produit, Integer> repository;

	@Autowired
	ProduitRepository produitRepository;

	public ProduitService(JpaRepository<Produit, Integer> repository) {
		this.repository = repository;
	}

	public List<Produit> findAll() {
		return this.produitRepository.findAll();
	}

	public Optional<Produit> findById(int id) {
		return this.produitRepository.findById(id);
	}

	public Produit save(Produit produit) {
		return this.produitRepository.save(produit);
	}

	public Produit update(int id, Produit produit) {
		return this.produitRepository.save(produit);

	}

	public void delete(int id) {
		this.produitRepository.deleteById(id);
	};
}
