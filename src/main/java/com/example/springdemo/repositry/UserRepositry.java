package com.example.springdemo.repositry;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springdemo.domain.User;

public interface UserRepositry extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();

}
