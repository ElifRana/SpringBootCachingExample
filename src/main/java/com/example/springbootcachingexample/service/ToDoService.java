package com.example.springbootcachingexample.service;

import com.example.springbootcachingexample.model.ToDoEntity;
import java.util.List;

public interface ToDoService {

    List<ToDoEntity> getAll();

    ToDoEntity getById(int id);

    ToDoEntity add(ToDoEntity toDoEntity);

    void delete(int id);
}
