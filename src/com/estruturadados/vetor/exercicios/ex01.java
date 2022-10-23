package com.estruturadados.vetor.exercicios;

import com.estruturadados.vetor.VetorGenerico;

public class ex01 {

    public static void main(String[] args) {

        // Implementar o método contém (busca elemento)

        VetorGenerico<Integer> vetor = new VetorGenerico<Integer>();

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(10);
        vetor.adiciona(30);
        vetor.adiciona(60);
        vetor.adiciona(10);

        int valor = 10;

        System.out.printf("Existe o valor %d no vetor? %b%n", valor, vetor.buscaElemento(valor));
        
    }
    
}
