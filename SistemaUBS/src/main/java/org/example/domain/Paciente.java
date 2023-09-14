package org.example.domain;

import org.example.enums.UBS;

public class Paciente extends Pessoa {
    private String idSUS;
    private UBS ubs;

    public Paciente(String nome, Integer cpf, Endereco endereco, String idSUS, UBS ubs) {
        super(nome, cpf, endereco);
        this.idSUS = idSUS;
        this.ubs = ubs;
    }

    public String getIdSUS() {
        return idSUS;
    }

    public UBS getUbs() {
        return ubs;
    }
    //Confirmar consulta
}
