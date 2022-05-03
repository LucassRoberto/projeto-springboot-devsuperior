package com.projetosite.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosite.course.entities.Product;
import com.projetosite.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){ //retornar todos os usuários da lista 
		return repository.findAll();
	}
	
	public Product findById(Long id) {  
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
