package com.projetosite.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetosite.course.entities.User;
import com.projetosite.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){ //retornar todos os usuários da lista 
		return repository.findAll();
	}
	
	public User findById(Long id) {  
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert (User obj) {  //operação para inserir no banco de dados um novo objeto do tipo User
		return repository.save (obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
}
