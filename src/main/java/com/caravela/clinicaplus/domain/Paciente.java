package com.caravela.clinicaplus.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Paciente extends Usuario {

    private String nomeCompleto;
    private String cpf;
    private Date dataNascimento;
    private Sexo sexo;
    private String telefone;
    private Endereco endereco;

    // Vai ser implementado a parte de qual é o tipo de plano, ou se é avulso.
}
