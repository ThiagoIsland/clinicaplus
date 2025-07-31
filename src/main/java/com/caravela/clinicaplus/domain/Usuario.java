package com.caravela.clinicaplus.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private int id;
    private String email;
    private String password;
    private String name;

}
