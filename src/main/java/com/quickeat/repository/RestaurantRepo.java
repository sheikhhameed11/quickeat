package com.quickeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quickeat.model.RegisterRestaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<RegisterRestaurant, Integer>{

}
