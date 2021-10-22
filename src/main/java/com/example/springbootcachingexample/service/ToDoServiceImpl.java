package com.example.springbootcachingexample.service;

import com.example.springbootcachingexample.model.ToDoEntity;
import com.example.springbootcachingexample.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j
public class ToDoServiceImpl implements ToDoService{

    private final ToDoRepository toDoRepository;

    @Override
    @Cacheable(cacheNames = "todos")
    public List<ToDoEntity> getAll() {
        try{
            System.out.println("Receiving all todos");
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return toDoRepository.findAll();
    }

    @Override
    @Cacheable(cacheNames = "todo", key = "#id")
    public ToDoEntity getById(int id) {
        return toDoRepository.findById(id).orElse(null);
    }

    @Override
    @Caching(put = {@CachePut (value = "todo")}, evict = {@CacheEvict(value = "todo")})
    public ToDoEntity add(ToDoEntity toDoEntity) {
        toDoRepository.save(toDoEntity);
        log.info("ToDo eklendi");
        return toDoEntity;
    }

    @Override
    @CacheEvict(value = "todo", key = "#id")
    public void delete(int id) {
        ToDoEntity toDoEntity = toDoRepository.findById(id).orElse(null);
        toDoRepository.delete(toDoEntity);
        log.info("ToDo silindi");
    }
}
