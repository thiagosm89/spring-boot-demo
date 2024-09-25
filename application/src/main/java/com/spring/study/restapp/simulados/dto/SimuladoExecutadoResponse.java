package com.spring.study.restapp.simulados.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class SimuladoExecutadoResponse extends SimuladoExecutadoRequest {

    private BigInteger id;

}
