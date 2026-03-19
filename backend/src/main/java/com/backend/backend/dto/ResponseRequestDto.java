package com.backend.backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseRequestDto {
    private List<ResponseDto> responses;
}

