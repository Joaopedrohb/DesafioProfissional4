package org.example.domain;

public class Endereco {
    private String logradouro;
    private String bairro;
    private Integer numero;

    public Endereco(String logradouro, String bairro, Integer numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public Integer getNumero() {
        return numero;
    }

}
