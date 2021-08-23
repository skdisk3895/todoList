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

    // Todo 수정
    public Todo updateTodo(Long id, String newContent);

    // Todo 삭제
    public void deleteTodo(Long id);

    // 모든 Todo 삭제
    public void deleteAllTodo();
}
