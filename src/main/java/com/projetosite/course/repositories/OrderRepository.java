package com.projetosite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosite.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
