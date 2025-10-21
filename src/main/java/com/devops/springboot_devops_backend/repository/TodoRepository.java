package com.devops.springboot_devops_backend.repository;

import com.devops.springboot_devops_backend.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem,Long> {
}
