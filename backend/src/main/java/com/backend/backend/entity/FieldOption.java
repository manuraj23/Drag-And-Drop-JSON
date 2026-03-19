package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FieldOption {
    @Id
    @GeneratedValue
    private Long id;

    private Long fieldId;
    private String value;
}