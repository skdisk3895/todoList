package com.example.demo.service;

import com.example.demo.domain.entity.Todo;
import com.example.demo.domain.repository.TodoRepository;
import com.example.demo.dto.TodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // 모든 todo 가져오기
    @Override
    public List<Todo> searchAllTodo() {
        return todoRepository.findAll();
    }

    // todo 추가
    @Override
    public Todo registerTodo(TodoDTO todoDTO) {
        return todoRepository.save(todoDTO.toEntity());
    }

    // Todo 수정
    @Override
    public Todo updateTodo(Long id, String newContent) {
        Todo todo = todoRepository.findById(id).get();
        todo.setContent(newContent);
        return todoRepository.save(todo);
    }

    // Todo 삭제
    @Override
    public void deleteTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();
        todoRepository.delete(todo);
    }
}
