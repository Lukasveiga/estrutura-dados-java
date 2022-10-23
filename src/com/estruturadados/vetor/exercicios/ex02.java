package com.estruturadados.vetor.exercicios;

import com.estruturadados.vetor.VetorGenerico;

public class ex02 {

    public static void main(String[] args) {

        // Implementar o método ultimo índice

        VetorGenerico<Integer> vetor = new VetorGenerico<Integer>();

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(10);
        vetor.adiciona(30);
        vetor.adiciona(60);
        vetor.adiciona(10);

        int valor = 15;

        System.out.printf("Ultimo índice do valor %d: %d%n", valor, vetor.ultimoIndice(valor));
        
    }
    
}
