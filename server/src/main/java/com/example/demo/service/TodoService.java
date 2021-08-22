package com.example.demo.service;

import com.example.demo.domain.entity.TodoEntity;
import com.example.demo.dto.TodoDTO;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {

    public TodoEntity registerTodo(TodoDTO params);
}
