package com.spring.study.business.exception;

import com.spring.study.business.vo.IdDisciplina;
import lombok.Getter;

@Getter
public class DisciplinaNotFoundException extends Exception {

    private static final String MESSAGE = "Disciplina not found";

    private IdDisciplina id;

    /**
     * @param idDisciplina que não foi encontrada
     */
    public DisciplinaNotFoundException(IdDisciplina idDisciplina) {
        super(MESSAGE);
    }

}
