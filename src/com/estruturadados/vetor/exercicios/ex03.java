package com.estruturadados.vetor.exercicios;

import com.estruturadados.vetor.VetorGenerico;

public class ex03 {

    public static void main(String[] args) {
        
        // Implementar o método remove

        VetorGenerico<Integer> vetor = new VetorGenerico<Integer>();

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(10);
        vetor.adiciona(30);
        vetor.adiciona(60);
        vetor.adiciona(10);

        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.remove(60);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.remove(10);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

    }
    
}
