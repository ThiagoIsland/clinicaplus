package com.caravela.clinicaplus.web;

import com.caravela.clinicaplus.domain.Medico;

import java.util.Scanner;

public class MedicoController {

    public void checaUsuário() {};

    public void cadastrarMedicoNome() {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Medico medico = new Medico();
        medico.setNomeCompleto(nome);
    };
}
