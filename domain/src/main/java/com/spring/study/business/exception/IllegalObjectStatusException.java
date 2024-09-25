package com.spring.study.business.exception;

/**
 * Essa exceção deve ser lançada quando um objeto de negócio não possui um estado válido para o funcionamento da
 * lógica de domain.
 *
 * Isso garante que o programador que vai usar um determinado método na camada de domain, crie o objeto corretamente e
 * com um estado consistente.
 */
public class IllegalObjectStatusException extends RuntimeException {

    public IllegalObjectStatusException(String message) {
        super(message);
    }

}
