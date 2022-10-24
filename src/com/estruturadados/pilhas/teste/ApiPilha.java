package com.estruturadados.pilhas.teste;

import java.util.Stack;

public class ApiPilha {

    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<Integer>();

        System.out.println(pilha.isEmpty());
        
        pilha_push(pilha);
        pilha_pop(pilha);
        pilha_push(pilha);
        pilha_peek(pilha);
        pilha_search(pilha, 6);
        pilha_search(pilha, 3);
    }

    static void pilha_push(Stack<Integer> pilha) {
        for (int i = 0;i < 5; i++) {
            pilha.push(i);
        }
    }

    static void pilha_pop(Stack<Integer> pilha) {
        System.out.println("Pop operation: ");
        for (int i = 0;i < 5; i++) {
            Integer y = (Integer) pilha.pop();
            System.out.println(y);
        }
        
    }

    static void pilha_peek(Stack<Integer> pilha) {
        System.out.println("Elemento no topo da pilha: " + pilha.peek());
    }

    static void pilha_search(Stack<Integer> pilha, int valor) {
        Integer pos = (Integer) pilha.search(valor);

        if (pos < 0) {
            System.out.println("O elemento não foi encontrado.");
        } else {
            System.out.println("Elemento foi encontrado na posição: " + pos);
        }
    }


    
}
