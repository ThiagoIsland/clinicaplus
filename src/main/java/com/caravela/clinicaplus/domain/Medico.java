package com.caravela.clinicaplus.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Medico {

    private String nomeCompleto;
    private String crm;
    private Especialidade especialidade;

    // A ser implementado a parte da Agenda do médico, indicando os dias disponíveis.
}
