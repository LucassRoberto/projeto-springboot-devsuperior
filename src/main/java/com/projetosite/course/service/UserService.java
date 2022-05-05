package com.projetosite.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projetosite.course.entities.User;
import com.projetosite.course.repositories.UserRepository;
import com.projetosite.course.service.exception.DatabaseException;
import com.projetosite.course.service.exception.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){ //retornar todos os usuários da lista 
		return repository.findAll();
	}
	
	//Produra o id do usuário
	public User findById(Long id) {  
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); //se o id não for encontrado, será lançada essa exceção
	}
	
	public User insert (User obj) {  //operação para inserir no banco de dados um novo objeto do tipo User
		return repository.save (obj);
	}
	
	public void delete (Long id) {
		try {
			repository.deleteById(id);
		} catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
			}
		}
	
	//atualizar usuário
	public User update (Long id, User obj) {
		User entity = repository.getById(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}

	//apenas esses dados poderão ser atualizados (Opção)
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
	entity.setPhone(obj.getPhone());	
	}
	
}
