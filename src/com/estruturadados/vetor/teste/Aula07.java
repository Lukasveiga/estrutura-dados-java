package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula07 {
    
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);
        
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");

        System.out.println(vetor);

        vetor.adiciona(0, "A");

        System.out.println(vetor);

        vetor.adiciona(3, "D");

        System.out.println(vetor);
    }
    
}
