package com.caravela.clinicaplus.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Medico {

    private long id;
    private String nome;
    private String crm;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private Date dataNascimento;
    private Sexo sexo;
    //ESPECIALIDADE VAI SER ENUM
    //CLASSE DE CONVÊNIO
    //CLASSE ‘USER’

}
