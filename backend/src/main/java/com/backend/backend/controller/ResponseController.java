package com.backend.backend.controller;

import com.backend.backend.dto.ResponseRequestDto;
import com.backend.backend.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forms")
@RequiredArgsConstructor
@CrossOrigin
public class ResponseController {

    private final ResponseService responseService;

    @PostMapping("/{id}/responses")
    public void submit(@PathVariable Long id,
                       @RequestBody ResponseRequestDto dto) {
        responseService.submitResponse(id, dto);
    }
}