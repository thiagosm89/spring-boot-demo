package com.spring.study.postgres.disciplina.adapter;

import com.spring.study.business.model.Disciplina;
import com.spring.study.business.ports.outbound.DisciplinaOutbound;
import com.spring.study.business.vo.IdDisciplina;

import java.util.Optional;

public class DisciplinaPostgresAdapter implements DisciplinaOutbound {

    @Override
    public Disciplina cadastrar(Disciplina disciplina) {
        return null;
    }

    @Override
    public Disciplina atualizar(Disciplina disciplina) {
        return null;
    }

    @Override
    public Optional<Disciplina> buscarPorId(IdDisciplina id) {
        return Optional.empty();
    }

    @Override
    public boolean verificaSeExistePorNome(String nome) {
        return false;
    }

}
