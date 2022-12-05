package com.demotest.blog.services;

import java.util.List;

import com.demotest.blog.entities.Post;
import com.demotest.blog.payloads.PostDto;
import com.demotest.blog.payloads.PostResponse;

public interface PostService {
	
	//CREATE
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	//UPDATE
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//DELETE
	void deletePost(Integer postId);
	
	//GET ALL POST
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy, String sortDir);
	
	//Get Post by Id
	PostDto getPostById(Integer postId);
	
	//Get ALl Post By Category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//Get all Post by user
	List<PostDto> getPostByUser(Integer userId);
	
	//Search Post
	List<PostDto> searchPosts(String keyword);
	

}
