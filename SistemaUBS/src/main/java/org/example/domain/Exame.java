package org.example.domain;

import org.example.enums.TipoExame;

import java.time.LocalDate;

public class Exame {
    private TipoExame tipoExame;
    private LocalDate horario;
    private String indicacoes;
    private Boolean confirmacao;

    public Exame(TipoExame tipoExame, LocalDate horario, String indicacoes) {
        this.tipoExame = tipoExame;
        this.horario = horario;
        this.indicacoes = indicacoes;
    }

    public void setConfirmacao(Boolean confirmacao) {
        this.confirmacao = confirmacao;
    }
}
