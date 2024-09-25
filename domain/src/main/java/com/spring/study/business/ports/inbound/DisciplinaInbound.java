package com.spring.study.business.ports.inbound;

import com.spring.study.business.exception.DisciplinaAlreadyExistsByNameException;
import com.spring.study.business.exception.DisciplinaNotFoundException;
import com.spring.study.business.model.Disciplina;

public interface DisciplinaInbound {

    /**
     * Permite cadastrar uma disciplina.
     * @param disciplina não pode ser nula
     * @return uma disciplina criada e agora com um id gerado.
     */
    Disciplina cadastrar(Disciplina disciplina) throws DisciplinaAlreadyExistsByNameException;

    /**
     * Permite atualizar uma disciplina
     * @param disciplina não pode ser nula
     * @return uma disciplina com os novos valores que foram atualizados.
     */
    Disciplina update(Disciplina disciplina) throws DisciplinaNotFoundException;

}
