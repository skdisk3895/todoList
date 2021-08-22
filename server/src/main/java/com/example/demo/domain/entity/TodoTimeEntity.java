package com.example.demo.domain.entity;

import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public class TodoTimeEntity {

    @CreatedDate
    private LocalDateTime created;

    public LocalDateTime getCreated() {
        return created;
    }
}
