package com.quickeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quickeat.model.Users;

@Repository
public interface RegisterRepository extends JpaRepository<Users, Integer>{

	
}
