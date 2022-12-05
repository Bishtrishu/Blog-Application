package com.demotest.blog.services;

import com.demotest.blog.payloads.CommentDto;

public interface CommentService {

		CommentDto createComment(CommentDto commentDto,Integer postId);
		void deleteComment(Integer commentId);
}
