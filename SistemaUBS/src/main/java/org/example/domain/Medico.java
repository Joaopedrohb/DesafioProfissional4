package org.example.domain;

import org.example.enums.TipoExame;
import org.example.enums.TipoRemedio;
import org.example.enums.UBS;

import java.time.LocalDate;
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

    public void gerarAtestado(Integer cid, String dias) {
        Atestado testeAtestado = new Atestado(cid, dias);
    }

    public void gerarExame(TipoExame tipoExame, LocalDate horario, String indicacoes) {
        Exame testeExame = new Exame(tipoExame, horario, indicacoes);
    }
    public void gerarReceita(TipoRemedio tipoRemedio, String dosagem, String obsercacoes) {
        Receita testeReceita = new Receita(tipoRemedio, dosagem, obsercacoes);
    }
    //Gerar atestado, gerar receita, gerar exame
}
