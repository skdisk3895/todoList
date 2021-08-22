package com.example.demo.MapperTests;

import com.example.demo.dto.TodoDTO;
import com.example.demo.mapper.TodoMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTests {

    @Autowired
    private TodoMapper todoMapper;

    @Test
    public void testOfInsert() {
        TodoDTO params = new TodoDTO();
        params.setContent("1번 todo");

        System.out.println(params);

        int result = todoMapper.insertTodo(params);
        System.out.println("결과는 " + result + "입니다. ");
    }
}
