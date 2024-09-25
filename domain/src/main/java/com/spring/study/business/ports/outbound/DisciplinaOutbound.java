package com.spring.study.business.ports.outbound;

import com.spring.study.business.model.Disciplina;
import com.spring.study.business.vo.IdDisciplina;

import java.util.Optional;

public interface DisciplinaOutbound {

    /**
     * Será cadastrada uma nova disciplina.
     *
     * @param disciplina que será criada e já validada.
     * @return disciplina criada com um id gerado.
     */
    Disciplina cadastrar(Disciplina disciplina);

    /**
     * Deve permitir atualizar uma disciplina.
     *
     * @param disciplina preparada para ser atualizada, já com o novo estado atualizado.
     * @return
     */
    Disciplina atualizar(Disciplina disciplina);

    /**
     * Buscar uma disciplina pelo seu identificador único.
     *
     * @param id da disciplina que estamos buscando e este valor nunca vai estar nulo ou empty, não necessitando
     *           fazer essa validação na implementacão do Outbound.
     *
     * @return uma única disciplina ou Optional.empty() se a disciplina não for encontrada.
     */
    Optional<Disciplina> buscarPorId(IdDisciplina id);

    /**
     * Buscar a disciplina pelo nome
     * @param nome da disciplina
     * @return se a disciplina já existe, devemos retornar true
     */
    boolean verificaSeExistePorNome(String nome);

}
