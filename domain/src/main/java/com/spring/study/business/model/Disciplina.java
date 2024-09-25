package com.spring.study.business.model;

import com.spring.study.business.exception.IllegalObjectStatusException;
import com.spring.study.business.vo.IdDisciplina;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Disciplina {

    private IdDisciplina id = IdDisciplina.empty();
    private String nome;
    private String descricao;

    public void validarSeNomeFoiInformado() {
        if(nomeIsEmptyOrNull()) {
            throw new IllegalObjectStatusException("nome was not provided.");
        }
    }

    public void validarSeDescricaoFoiInformada() {
        if(descricaoIsEmptyOrNull()) {
            throw new IllegalObjectStatusException("descricao was not provided.");
        }
    }

    public void validarSeIdNaoFoiInformado() {
        if(this.id.nonEmpty()) {
            throw new IllegalObjectStatusException("id was provided but expected to be empty.");
        }
    }

    public void validarSeIdFoiInformado() {
        if(this.id.isEmpty()) {
            throw new IllegalObjectStatusException("id was not provided.");
        }
    }

    public void updateStatus(Disciplina disciplina) {
        if(this.equals(disciplina)) {
            return;
        }

        this.nome = disciplina.getNome();
        this.descricao = disciplina.getDescricao();
    }

    public Disciplina formatarParaCriar() {
        return this
                .nomeUpperCase()
                .nomeTrim();
    }

    public Disciplina nomeUpperCase() {
        this.nome = this.nome.toUpperCase();
        return this;
    }

    public Disciplina nomeTrim() {
        this.nome = this.nome.trim();
        return this;
    }

    private boolean nomeIsEmptyOrNull() {
        return nome == null || nome.isEmpty() || nome.isBlank();
    }

    private boolean descricaoIsEmptyOrNull() {
        return descricao == null || descricao.isEmpty() || descricao.isBlank();
    }

}
