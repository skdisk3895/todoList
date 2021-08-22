package com.example.demo.controller;

import com.example.demo.domain.entity.TodoEntity;
import com.example.demo.dto.TodoDTO;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/create")
    public TodoEntity registerTodo(@RequestBody TodoDTO todoDTO) {
        return todoService.registerTodo(todoDTO);
    }
}
