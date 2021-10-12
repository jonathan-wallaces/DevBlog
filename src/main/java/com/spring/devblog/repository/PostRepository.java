package com.spring.devblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.devblog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
