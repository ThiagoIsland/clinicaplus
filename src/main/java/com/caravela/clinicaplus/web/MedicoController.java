package com.caravela.clinicaplus.web;

import com.caravela.clinicaplus.domain.Medico;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named("medicoController") // Torna o bean acessível na view como #{medicoController}
@ViewScoped              // O bean viverá enquanto o usuário estiver na mesma página JSF.
public class MedicoController implements Serializable { // Beans @ViewScoped devem ser serializáveis

    @Getter
    @Setter
    private Medico medico;

    @PostConstruct
    public void init() {
        // Garante que o objeto 'medico' nunca será nulo na página
        medico = new Medico();
    }

    public void salvar() {
        // TODO: Implementar a lógica para salvar o médico no banco de dados
        System.out.println("Salvando o médico: " + medico.getNome());
    }
}
