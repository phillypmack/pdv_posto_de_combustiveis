package com.br.domain.entity;

import java.util.Date;

public class Pessoa {

    //atributos

    private String nomeCompleto;
    private String cpfCnpj;
    private Date dataNascimento;
    private Interger numeroCtps;

    //construtor

    public Pessoa (String nomeCompleto, String cpfCnpj, Date dataNascimento, Interger numeroCtps){
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;

    }

    //getters
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public String getCpfCnpj(){
        return cpfCnpj;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public Interger getNumeroCtps(){
        return numeroCtps;
    }


    //setters
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public void setCpfCnpj(String cpfCnpj){
        this.cpfCnpj = cpfCnpj;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setNumeroCtps(Interger numeroCtps){
        this.numeroCtps = numeroCtps;
    }

}
