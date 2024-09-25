package com.spring.study.restapp.disciplinas.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class DisciplinaResponse extends DisciplinaRequest {

    private BigInteger id;

}
