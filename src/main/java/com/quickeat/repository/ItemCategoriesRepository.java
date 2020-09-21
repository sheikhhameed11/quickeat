package com.quickeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quickeat.model.ItemCategories;

@Repository
public interface ItemCategoriesRepository extends JpaRepository<ItemCategories, Integer>{

}
