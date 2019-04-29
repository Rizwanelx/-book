package com.example.springdemo.service;

import java.util.Set;

import com.example.springdemo.domain.User;
import com.example.springdemo.domain.security.UserRole;
public interface UserService {
	User createUser(User user, Set<UserRole> userRoles);
}
