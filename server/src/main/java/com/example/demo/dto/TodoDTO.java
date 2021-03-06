package com.example.demo.dto;

import com.example.demo.domain.entity.Todo;
import com.example.demo.domain.entity.TodoTimeEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString(exclude = {"id", "created"}, includeFieldNames = false)
public class TodoDTO {

    /** 변호 (pk) **/
    private Long id;

    /** 내용 **/
    private String content;

    /** 작성일 **/
    private LocalDateTime created;

    public String getContent() {
        return content;
    }

    public Todo toEntity() {
        return new Todo(null, content);
    }
}
