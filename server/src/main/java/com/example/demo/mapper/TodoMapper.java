package com.example.demo.mapper;

import com.example.demo.dto.TodoDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoMapper {
    /** Todo 추가 **/
    public int insertTodo(TodoDTO params);

    /** Todo list 조회 **/
//    public List<TodoDTO> selectTodo();
}
