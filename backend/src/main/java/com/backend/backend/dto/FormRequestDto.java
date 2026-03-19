package com.backend.backend.dto;

import lombok.Data;
import java.util.List;

@Data
public class FormRequestDto {
    private String title;
    private List<FieldDto> fields;
}

