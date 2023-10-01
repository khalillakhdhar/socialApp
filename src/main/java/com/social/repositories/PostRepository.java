package com.social.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
