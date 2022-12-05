package com.demotest.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demotest.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer> {

}
