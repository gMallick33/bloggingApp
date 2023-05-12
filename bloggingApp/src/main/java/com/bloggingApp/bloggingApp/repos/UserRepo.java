package com.bloggingApp.bloggingApp.repos;

import com.bloggingApp.bloggingApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
