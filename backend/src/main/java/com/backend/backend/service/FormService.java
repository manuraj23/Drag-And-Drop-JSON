package com.backend.backend.service;

import com.backend.backend.dto.FieldDto;
import com.backend.backend.dto.FormRequestDto;
import com.backend.backend.entity.Field;
import com.backend.backend.entity.Form;
import com.backend.backend.repository.FieldRepository;
import com.backend.backend.repository.FormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormService {

    private final FormRepository formRepo;
    private final FieldRepository fieldRepo;

    public void createForm(FormRequestDto dto) {
        Form form = new Form();
        form.setTitle(dto.getTitle());
        form = formRepo.save(form);

        for (FieldDto f : dto.getFields()) {
            Field field = new Field();
            field.setFormId(form.getId());
            field.setLabel(f.getLabel());
            field.setType(f.getType());
            field.setRequired(f.isRequired());
            fieldRepo.save(field);
        }
    }

    public List<Form> getAllForms() {
        return formRepo.findAll();
    }
}