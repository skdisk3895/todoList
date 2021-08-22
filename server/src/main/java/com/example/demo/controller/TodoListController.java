package com.example.demo.controller;

import com.example.demo.domain.entity.Todo;
import com.example.demo.dto.TodoDTO;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 스프링 자체에서 view를 보여주지 않으므로 REST API용 controller로 선언
@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    private TodoService todoService;

    // 클라이언트에서 모든 todoList 요청
    @GetMapping("/findall")
    public List<Todo> searchAllTodo() {
        return todoService.searchAllTodo();
    }

    // 클라이언트에서 todo 작성 요청
    @PostMapping("/create")
    public Todo registerTodo(@RequestBody TodoDTO todoDTO) {
        // 비즈니스 로직단(Service)으로 넘긴다.
        return todoService.registerTodo(todoDTO);
    }

    // 특정 todo 수정
    @PutMapping("/update/{id}")
    public Todo updateTodo(@RequestBody TodoDTO todoDTO, @PathVariable Long id) {
        return todoService.updateTodo(id, todoDTO.getContent());
    }

    // 특정 todo 삭제
    @DeleteMapping("/delete/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
