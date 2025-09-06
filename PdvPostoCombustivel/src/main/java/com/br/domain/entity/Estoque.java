package com.br.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Estoque {

    private Date dataValidade;
    private BigDecimal quantidade;
    private String localTanque;
    private String localEndereco;
    private String loteFabricacao;


    public Estoque(BigDecimal quantidade,
                   String localEndereco,
                   String loteFabricacao,
                   Date dataValidade){
        this.quantidade = quantidade;
        this.localEndereco = localEndereco;
        this.loteFabricacao = loteFabricacao;
        this.dataValidade = dataValidade;

    }

}
