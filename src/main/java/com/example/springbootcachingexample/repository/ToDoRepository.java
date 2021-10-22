package com.example.springbootcachingexample.repository;

import com.example.springbootcachingexample.model.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {

}
