package com.mrvw.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrvw.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
