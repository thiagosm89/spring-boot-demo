package com.spring.study.restapp.disciplinas.adapter;

import com.spring.study.business.model.Disciplina;
import com.spring.study.business.ports.inbound.DisciplinaInbound;
import com.spring.study.restapp.disciplinas.dto.DisciplinaRequest;
import com.spring.study.restapp.disciplinas.dto.DisciplinaResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DisciplinaAdapter {

    private DisciplinaInbound disciplinaInbound;

    public DisciplinaResponse cadastrar(DisciplinaRequest disciplinaRequest) {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(disciplinaRequest.getNome());
        disciplina.setDescricao(disciplinaRequest.getDescricao());

        Disciplina disciplinaCadastrada = disciplinaInbound.cadastrar(disciplina);

        DisciplinaResponse disciplinaResponse = new DisciplinaResponse();
        disciplinaResponse.setId(disciplinaCadastrada.getId());
        disciplinaResponse.setNome(disciplina.getNome());
        disciplinaResponse.setDescricao(disciplinaResponse.getDescricao());
        return disciplinaResponse;
    }

}
