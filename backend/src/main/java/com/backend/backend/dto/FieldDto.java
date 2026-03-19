package com.backend.backend.dto;

import lombok.Data;
import java.util.List;

@Data
public class FieldDto {
    private String label;
    private String type;
    private boolean required;
    private List<String> options;
}
