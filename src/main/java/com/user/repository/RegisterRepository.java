package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.RegisterEntity;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer>{

	
}
