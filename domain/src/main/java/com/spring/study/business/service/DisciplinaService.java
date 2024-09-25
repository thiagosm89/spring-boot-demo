package com.spring.study.business.service;

import com.spring.study.business.exception.DisciplinaAlreadyExistsByNameException;
import com.spring.study.business.exception.DisciplinaNotFoundException;
import com.spring.study.business.model.Disciplina;
import com.spring.study.business.ports.inbound.DisciplinaInbound;
import com.spring.study.business.ports.outbound.DisciplinaOutbound;
import com.spring.study.business.vo.IdDisciplina;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class DisciplinaService implements DisciplinaInbound {

    private DisciplinaOutbound disciplinaOutbound;

    @Override
    public Disciplina cadastrar(Disciplina disciplina) throws DisciplinaAlreadyExistsByNameException {
        validacaoComum(disciplina);
        disciplina.validarSeIdNaoFoiInformado();

        disciplina.formatarParaCriar();

        if(disciplinaOutbound.verificaSeExistePorNome(disciplina.getNome())) {
            throw new DisciplinaAlreadyExistsByNameException();
        }

        Disciplina disciplinaCadastrada = disciplinaOutbound.cadastrar(disciplina);
        disciplinaCadastrada.validarSeIdFoiInformado();

        return disciplinaCadastrada;
    }

    @Override
    public Disciplina update(Disciplina disciplina) throws DisciplinaNotFoundException {
        validacaoComum(disciplina);
        disciplina.validarSeIdFoiInformado();

        IdDisciplina id = disciplina.getId();

        Disciplina disciplinaEncontrada = disciplinaOutbound
                .buscarPorId(id)
                .orElseThrow(() -> new DisciplinaNotFoundException(id));

        disciplinaEncontrada.updateStatus(disciplina);

        Disciplina disciplinaAtualizada = disciplinaOutbound.atualizar(disciplinaEncontrada);
        validacaoComum(disciplinaAtualizada);
        disciplinaAtualizada.validarSeIdFoiInformado();

        return disciplinaAtualizada;
    }

    private void validacaoComum(Disciplina disciplina) {
        Objects.requireNonNull(disciplina);

        disciplina.validarSeNomeFoiInformado();
        disciplina.validarSeDescricaoFoiInformada();
    }

}
