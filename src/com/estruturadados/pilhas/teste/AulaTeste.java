package com.estruturadados.pilhas.teste;

import com.estruturadados.pilhas.Pilha;

public class AulaTeste {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());
        System.out.println(pilha.topo());                                                                                                               

        for (int i = 0; i < 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.topo());
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.tamanho());

        System.out.println(pilha.desempilha());
        System.out.println(pilha);
        
    }

    
}
