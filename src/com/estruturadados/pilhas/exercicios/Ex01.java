package com.estruturadados.pilhas.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<>();

        pushEvenNumbers(pilha, scan);
        checkIfIsEmpty(pilha);

        scan.close();
    }

    static void pushEvenNumbers(Stack<Integer> pilha, Scanner scan) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número inteiro: ");
            int numero = scan.nextInt();

            if (numero % 2 ==0) {
                pilha.push(numero);
            } else if (numero % 2 != 0){
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia;");
                } else {
                    pilha.pop();
                }
            }
        }
    }

    static void checkIfIsEmpty(Stack<Integer> pilha) {
        if (!pilha.isEmpty()) {
            int size = pilha.size();
            for (int i = 0; i < size; i++) {
                System.out.println(pilha.pop());
            }
        } else {
            System.out.println("A pilha está vazia.");
        }
    }
    
}
