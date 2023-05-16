package com.bloggingApp.bloggingApp.repos;

import com.bloggingApp.bloggingApp.entities.Category;
import com.bloggingApp.bloggingApp.entities.Post;
import com.bloggingApp.bloggingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}
