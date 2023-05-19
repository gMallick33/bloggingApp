package com.bloggingApp.bloggingApp.repos;

import com.bloggingApp.bloggingApp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
}
