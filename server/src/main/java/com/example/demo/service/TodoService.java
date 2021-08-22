package com.example.demo.service;

import com.example.demo.domain.entity.Todo;
import com.example.demo.dto.TodoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
    // 모든 todo 가져오기
    public List<Todo> searchAllTodo();

    // Todo 등록
    public Todo registerTodo(TodoDTO params);
}
