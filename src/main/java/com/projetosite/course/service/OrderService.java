package com.projetosite.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosite.course.entities.Order;
import com.projetosite.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){ //retornar todos os usuários da lista 
		return repository.findAll();
	}
	
	public Order findById(Long id) {  
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
