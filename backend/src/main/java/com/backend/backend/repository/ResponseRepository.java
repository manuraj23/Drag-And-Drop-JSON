package com.backend.backend.repository;

import com.backend.backend.entity.FormResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<FormResponse, Long> {}