package com.example.webapp.service;

import com.example.webapp.DTO.ToDoDTO;
import com.example.webapp.entity.ToDo;

import java.util.List;

// ToDo Service
public interface ToDoService {

//    ToDo 조회
    List<ToDo> findAllToDo();

//    ToDo Select
    ToDo findByIdToDo(Integer id);

//    ToDo Insert
    void insertToDo(ToDo toDo);

//    ToDo Update
    void updateToDo(Integer id, ToDoDTO toDoDTO);

//    ToDo Delete
    void deleteToDo(Integer id);
}
