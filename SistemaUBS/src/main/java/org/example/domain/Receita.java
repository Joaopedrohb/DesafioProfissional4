package org.example.domain;

import org.example.enums.TipoExame;
import org.example.enums.TipoRemedio;

public class Receita {
    private TipoRemedio tipoRemedio;
    private String dosagem;
    private String observacoes;

    public Receita(TipoRemedio tipoRemedio, String dosagem, String observacoes) {
        this.tipoRemedio = tipoRemedio;
        this.dosagem = dosagem;
        this.observacoes = observacoes;
    }
}
