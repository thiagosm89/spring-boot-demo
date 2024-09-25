package com.spring.study.business.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class IdDisciplina {

    private static final IdDisciplina EMPTY = new IdDisciplina(null);

    private BigInteger value;

    public static IdDisciplina empty() {
        return EMPTY;
    }

    public static IdDisciplina of(BigInteger value) {
        Objects.requireNonNull(value, "value must not be null");
        return new IdDisciplina(value);
    }

    public BigInteger getValue() {
        return value;
    }

    public boolean isEmpty() {
        return this.equals(EMPTY);
    }

    public boolean nonEmpty() {
        return !isEmpty();
    }

}
