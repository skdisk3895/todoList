package com.example.demo.service;

import com.example.demo.domain.entity.TodoEntity;
import com.example.demo.domain.repository.TodoRepository;
import com.example.demo.dto.TodoDTO;
import com.example.demo.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoEntity registerTodo(TodoDTO todoDTO) {
        return todoRepository.save(todoDTO.toEntity());
    }
}
