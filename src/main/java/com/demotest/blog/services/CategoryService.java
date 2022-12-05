package com.demotest.blog.services;

import java.util.List;

import com.demotest.blog.payloads.CategoryDto;



public interface CategoryService {

	//Create 
	CategoryDto createCategory(CategoryDto categoryDto);
	
	
	//UPDATE
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	
	//delete
	public void deleteCategory(Integer categoryId);

	
	//Get
	CategoryDto getCategory(Integer categoryId);
	
	//GetAll
	List<CategoryDto> getCategories();
	
}
