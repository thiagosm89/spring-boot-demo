package com.spring.study.restapp.disciplinas.controller;

import com.spring.study.restapp.disciplinas.adapter.DisciplinaAdapter;
import com.spring.study.restapp.disciplinas.dto.DisciplinaRequest;
import com.spring.study.restapp.disciplinas.dto.DisciplinaResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
@AllArgsConstructor
public class DisciplinaController {

    private final DisciplinaAdapter disciplinaAdapter;

    @PostMapping
    public DisciplinaResponse cadastrar(@RequestBody DisciplinaRequest body) {

        return null;
    }

}
