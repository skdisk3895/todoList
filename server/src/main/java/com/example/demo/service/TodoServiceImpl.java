package com.example.demo.service;

import com.example.demo.domain.entity.Todo;
import com.example.demo.domain.repository.TodoRepository;
import com.example.demo.dto.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // 모든 todo 가져오기
    @Override
    public List<Todo> searchAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public Todo registerTodo(TodoDTO todoDTO) {
        return todoRepository.save(todoDTO.toEntity());
    }
}
