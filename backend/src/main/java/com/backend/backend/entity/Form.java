package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Form {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private LocalDateTime createdAt = LocalDateTime.now();
}