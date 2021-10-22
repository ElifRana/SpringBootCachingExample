package com.example.springbootcachingexample.controller;

import com.example.springbootcachingexample.model.ToDoEntity;
import com.example.springbootcachingexample.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/getAll")
    public List<ToDoEntity> getAll(){
        return toDoService.getAll();
    }

    @GetMapping("/getById")
    public ToDoEntity getById(@RequestParam int id){
        return toDoService.getById(id);
    }

    @PutMapping("/add")
    public ResponseEntity<?> add(@RequestBody ToDoEntity toDoEntity){
        return ResponseEntity.ok(this.toDoService.add(toDoEntity));
    }

    @DeleteMapping
    public void delete(@RequestParam int id){
        toDoService.delete(id);
    }
}
