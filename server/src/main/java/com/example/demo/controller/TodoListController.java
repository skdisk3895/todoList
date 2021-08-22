package com.example.demo.controller;

import com.example.demo.domain.entity.Todo;
import com.example.demo.dto.TodoDTO;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링 자체에서 view를 보여주지 않으므로 REST API용 controller로 선언
@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    private TodoService todoService;

    // 클라이언트에서 todo 작성 요청
    @PostMapping("/create")
    public Todo registerTodo(@RequestBody TodoDTO todoDTO) {
        // 비즈니스 로직단(Service)으로 넘긴다.
        return todoService.registerTodo(todoDTO);
    }
}
