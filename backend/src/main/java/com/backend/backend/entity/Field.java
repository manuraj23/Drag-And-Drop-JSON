package com.backend.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Field {
    @Id
    @GeneratedValue
    private Long id;

    private Long formId;
    private String label;
    private String type;
    private boolean required;
}
