package com.projetosite.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosite.course.entities.Product;
import com.projetosite.course.service.ProductService;

@RestController 
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity <List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //indica que a requisição vai aceitar um id dentro da URL
	public ResponseEntity<Product> findById (@PathVariable Long id){//end point para buscar o usuário pelo id
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
