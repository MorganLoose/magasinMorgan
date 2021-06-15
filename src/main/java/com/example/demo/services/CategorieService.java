package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.models.Commande;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.repositories.ClientRepository;

public class CategorieService {

	private JpaRepository<Categorie, Integer> repository;

	@Autowired
	CategorieRepository categorieRepository;

	
	public CategorieService(JpaRepository<Categorie, Integer> repository) {
		this.repository = repository;
	}

	public List<Categorie> findAll() {
		return this.categorieRepository.findAll();
	}

	public Optional<Categorie> findById(int id) {
		return this.categorieRepository.findById(id);
	}

	public Categorie save(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}

	public Categorie update(int id, Categorie categorie) {
		return this.categorieRepository.save(categorie);

	}

	public void delete(int id) {
		this.categorieRepository.deleteById(id);
	};
}
