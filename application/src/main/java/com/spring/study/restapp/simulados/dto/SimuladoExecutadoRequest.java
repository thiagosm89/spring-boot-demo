package com.spring.study.restapp.simulados.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimuladoExecutadoRequest {
    private Long idAluno;
    private Long idDisciplina;
    private Integer totalAcertos;
    private Integer totalQuestoes;
}
