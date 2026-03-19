package com.backend.backend.controller;

import com.backend.backend.dto.FormRequestDto;
import com.backend.backend.entity.Form;
import com.backend.backend.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forms")
@RequiredArgsConstructor
@CrossOrigin
public class FormController {

    private final FormService formService;

    @PostMapping
    public void createForm(@RequestBody FormRequestDto dto) {
        formService.createForm(dto);
    }

    @GetMapping
    public List<Form> getForms() {
        return formService.getAllForms();
    }
}
