package com.estruturadados.fila.testPacientePrioridade;

import com.estruturadados.fila.FilaComPrioridade;

public class Teste {

    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A", 2));
        fila.enfileira(new Paciente("B", 3));
        fila.enfileira(new Paciente("C", 2));

        System.out.println(fila);

        
    }
    
}
