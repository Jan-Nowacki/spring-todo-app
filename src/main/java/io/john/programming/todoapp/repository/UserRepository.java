package io.john.programming.todoapp.repository;

import io.john.programming.todoapp.entity.Todo;
import io.john.programming.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
}
