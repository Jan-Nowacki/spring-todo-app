package io.john.programming.todoapp.repository;

import io.john.programming.todoapp.entity.Todo;
import io.john.programming.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
