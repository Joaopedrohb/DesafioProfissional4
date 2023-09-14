package org.example.domain;

import org.example.enums.UBS;

import java.util.Scanner;

public class Medico extends Pessoa{
    private Integer CRM;
    private Integer matricula;
    private UBS ubs;

    public Medico(String nome, Integer cpf, Endereco endereco, Integer CRM, Integer matricula, UBS ubs) {
        super(nome, cpf, endereco);
        this.CRM = CRM;
        this.matricula = matricula;
        this.ubs = ubs;
    }

    public Integer getCRM() {
        return CRM;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public UBS getUbs() {
        return ubs;
    }

    public void gerarAtestado() {
        Scanner le = new Scanner(System.in);
        String dias = "3 dias";
        Integer cid = 1234;
        Atestado teste = new Atestado(cid, dias);
    }

    //Gerar atestado, gerar receita, gerar exame
}
