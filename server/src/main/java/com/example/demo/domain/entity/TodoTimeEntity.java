package com.example.demo.domain.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class TodoTimeEntity {

    @CreatedDate
    private LocalDateTime created;

    public LocalDateTime getCreated() {
        return created;
    }
}
