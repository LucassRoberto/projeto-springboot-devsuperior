package com.projetosite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosite.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
