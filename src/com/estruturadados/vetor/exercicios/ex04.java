package com.estruturadados.vetor.exercicios;

import com.estruturadados.vetor.VetorGenerico;

public class ex04 {

    public static void main(String[] args) {
        
        VetorGenerico<Integer> vetor = new VetorGenerico<Integer>();

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(10);
        vetor.adiciona(30);
        vetor.adiciona(60);
        vetor.adiciona(10);

        int index = 4;

        System.out.printf("Valor no índice %d: %d%n", index, vetor.buscaElementoIndex(index));
    }
    
}
