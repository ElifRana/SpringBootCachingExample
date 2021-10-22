package com.example.springbootcachingexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "toDoEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "description", nullable = false)
    private String description;
}
