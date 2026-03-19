package com.backend.backend.service;

import com.backend.backend.dto.ResponseDto;
import com.backend.backend.dto.ResponseRequestDto;
import com.backend.backend.entity.Field;
import com.backend.backend.entity.FormResponse;
import com.backend.backend.entity.ResponseValue;
import com.backend.backend.repository.FieldRepository;
import com.backend.backend.repository.ResponseRepository;
import com.backend.backend.repository.ResponseValueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResponseService {

    private final ResponseRepository responseRepo;
    private final ResponseValueRepository valueRepo;
    private final FieldRepository fieldRepo;

    public void submitResponse(Long formId, ResponseRequestDto dto) {

        FormResponse response = new FormResponse();
        response.setFormId(formId);
        response = responseRepo.save(response);

        for (ResponseDto r : dto.getResponses()) {

            Field field = fieldRepo.findById(r.getFieldId())
                    .orElseThrow();

            ResponseValue val = new ResponseValue();
            val.setResponseId(response.getId());
            val.setFieldId(r.getFieldId());

            switch (field.getType()) {
                case "number":
                    val.setNumberValue(Double.parseDouble(r.getValue()));
                    break;
                default:
                    val.setTextValue(r.getValue());
            }

            valueRepo.save(val);
        }
    }
}