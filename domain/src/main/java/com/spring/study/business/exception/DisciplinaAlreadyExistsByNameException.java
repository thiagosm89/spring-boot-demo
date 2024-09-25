package com.spring.study.business.exception;

import lombok.Getter;

@Getter
public class DisciplinaAlreadyExistsByNameException extends Exception {

    private static final String MESSAGE = "Disciplina already exists by name";

    public DisciplinaAlreadyExistsByNameException() {
        super(MESSAGE);
    }

}
