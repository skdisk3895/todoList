package com.example.demo.service;

import com.example.demo.domain.entity.Todo;
import com.example.demo.dto.TodoDTO;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {

    public Todo registerTodo(TodoDTO params);
}
