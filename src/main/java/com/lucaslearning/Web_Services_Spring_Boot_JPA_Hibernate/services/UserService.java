package com.lucaslearning.Web_Services_Spring_Boot_JPA_Hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaslearning.Web_Services_Spring_Boot_JPA_Hibernate.entities.User;
import com.lucaslearning.Web_Services_Spring_Boot_JPA_Hibernate.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj =  repository.findById(id);
		return obj.get();
	}
}
