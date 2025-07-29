package com.caravela.clinicaplus;

import jakarta.faces.view.ViewScoped;
import org.springframework.stereotype.Component;
import java.io.Serializable;

/**
 * Um Backing Bean de exemplo gerenciado pelo Spring.
 * A anotação @Component faz com que o Spring o reconheça.
 * A anotação @ViewScoped define seu ciclo de vida na página JSF.
 */
@Component
@ViewScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message = "Olá do Spring Boot + JSF + PrimeFaces!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}