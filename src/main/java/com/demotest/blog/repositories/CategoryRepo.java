package com.demotest.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demotest.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
