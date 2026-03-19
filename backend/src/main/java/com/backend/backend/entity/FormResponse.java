package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class FormResponse {
    @Id
    @GeneratedValue
    private Long id;

    private Long formId;
    private LocalDateTime submittedAt = LocalDateTime.now();
}