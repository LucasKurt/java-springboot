package com.lucaslearning.Web_Services_Spring_Boot_JPA_Hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaslearning.Web_Services_Spring_Boot_JPA_Hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
