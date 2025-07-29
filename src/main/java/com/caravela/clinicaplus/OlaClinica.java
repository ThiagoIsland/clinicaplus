package com.caravela.clinicaplus;

import jakarta.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.io.Serializable;


@Component
@ViewScoped
@Getter
@Setter
public class OlaClinica implements Serializable {

    private String message = "Esse projeto vai ser realizado com sucesso. Obrigado Deus por tudo!";

}