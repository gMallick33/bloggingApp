package com.bloggingApp.bloggingApp.repos;

import com.bloggingApp.bloggingApp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
