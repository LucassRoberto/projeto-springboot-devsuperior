package com.projetosite.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosite.course.entities.Category;
import com.projetosite.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){ //retornar todos os usuários da lista 
		return repository.findAll();
	}
	
	public Category findById(Long id) {  
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
