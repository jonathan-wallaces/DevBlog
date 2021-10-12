package com.spring.devblog.service;

import java.util.List;

import com.spring.devblog.model.Post;

public interface PostService {

	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
}
