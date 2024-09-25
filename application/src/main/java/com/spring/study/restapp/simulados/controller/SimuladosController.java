package com.spring.study.restapp.simulados.controller;

import com.spring.study.restapp.simulados.dto.SimuladoExecutadoRequest;
import com.spring.study.restapp.simulados.dto.SimuladoExecutadoResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simulados")
public class SimuladosController {

    @PostMapping
    public SimuladoExecutadoResponse cadastrar(@RequestBody SimuladoExecutadoRequest body) {
        return null;
    }

}
