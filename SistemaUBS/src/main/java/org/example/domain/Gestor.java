package org.example.domain;

import org.example.enums.UBS;

public class Gestor extends Pessoa {
    private Integer matricula;
    private UBS ubs;

    public Gestor(String nome, Integer cpf, Endereco endereco, Integer matricula, UBS ubs) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.ubs = ubs;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public UBS getUbs() {
        return ubs;
    }

}
