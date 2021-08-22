package com.example.demo.dto;

import com.example.demo.domain.entity.TodoEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodoDTO {

    /** 변호 (pk) **/

    private Long id;

    /** 내용 **/
    private String content;

    /** 작성일 **/
    private LocalDateTime created;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public TodoEntity toEntity() {
        return new TodoEntity(null, content);
    }
}
