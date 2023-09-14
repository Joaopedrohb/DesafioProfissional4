package org.example.enums;

import org.example.domain.Endereco;

public enum UBS {
    UBS_ALVORADA(1,
            "UBS Alvorada",
            "R. Ibirá",
            "Jardim Alvorada",
            433),
    UBS_IGUACU(2,
            "UBS Iguaçu",
            "Av. Arquiteto Nildo Ribeiro da Rocha",
            "Jardim Iguaçú",
            5328 ),
    UBS_MARINGA_VELHO(3,
            "UBS Maringá Velho",
            " R. Antônio Otávio Scramim",
            "Zona 05",
            1838),
    UBS_TUIUTI(4,
            "UBS Tuiuti",
            "R. Caracas",
            "Vila Morangueira",
            1986),
    UBS_MANDACARU(5,
            "UBS Mandacaru",
            "Av. Mandacaru",
            "Jardim Monte Carlo",
            465);
    private int codigo;
    private String nome;
    private String logradouro;
    private String bairro;
    private Integer numero;

    UBS(int codigo, String nome, String logradouro, String bairro, Integer numero) {
        this.codigo = codigo;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
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
