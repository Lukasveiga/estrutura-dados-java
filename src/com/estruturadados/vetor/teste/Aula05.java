package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        vetor.adiciona(5);
        vetor.adiciona(10);
        vetor.adiciona(11);

        System.out.println(vetor.busca(2));
    }
    
}
