package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(1);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);
        
        vetor.remove("B");

        System.out.println(vetor);
        
    }
    
}
