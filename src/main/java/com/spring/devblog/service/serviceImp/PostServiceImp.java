package com.spring.devblog.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.devblog.model.Post;
import com.spring.devblog.repository.PostRepository;
import com.spring.devblog.service.PostService;
@Service
public class PostServiceImp implements PostService {
	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return postRepository.save(post);
	}

}
