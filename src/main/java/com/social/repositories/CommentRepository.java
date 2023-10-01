package com.social.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.social.entities.Comment;

public interface CommentRepository {
Page<Comment> findByPostId(long postId,Pageable page);
}
