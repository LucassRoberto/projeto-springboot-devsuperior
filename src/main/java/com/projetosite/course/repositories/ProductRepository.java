package com.projetosite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosite.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
