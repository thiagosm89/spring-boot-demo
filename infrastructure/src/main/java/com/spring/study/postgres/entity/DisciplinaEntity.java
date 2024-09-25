package com.spring.study.postgres.entity;

import lombok.Data;

import java.math.BigInteger;

@Data
public class DisciplinaEntity {
    private BigInteger id;
    private String nome;
    private String descricao;
}
