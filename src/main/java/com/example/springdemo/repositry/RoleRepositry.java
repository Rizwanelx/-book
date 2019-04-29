package com.example.springdemo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.springdemo.domain.security.Role;

public interface RoleRepositry extends CrudRepository<Role, Long>  {

}
