package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.VetorGenerico;

public class Aula11 {

    public static void main(String[] args) {

        VetorGenerico<String> vetor = new VetorGenerico<String>(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor);
        
        
    }
    
}
