package com.bloggingApp.bloggingApp.repos;

import com.bloggingApp.bloggingApp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
