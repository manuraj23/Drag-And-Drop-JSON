package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ResponseValue {
    @Id
    @GeneratedValue
    private Long id;

    private Long responseId;
    private Long fieldId;

    private String textValue;
    private Double numberValue;
}
