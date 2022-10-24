package com.estruturadados.pilhas.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Stack<Integer> evenStack = new Stack<>();
        Stack<Integer> oddStack = new Stack<>();

        pushEvenOddNumbers(evenStack, oddStack, scan);
        checkIfIsEmpty(evenStack);
        checkIfIsEmpty(oddStack);


        
    }

    static void pushEvenOddNumbers(Stack<Integer> evenStack, Stack<Integer> oddStack, Scanner scan) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número inteiro: ");
            int numero = scan.nextInt();

            if (numero == 0) {
                if (evenStack.isEmpty() || oddStack.isEmpty()) {
                    System.out.println("Error: pilhas vazias.");
                } else {
                    evenStack.pop();
                    oddStack.pop();
                }
            } else if (numero % 2 == 0) {
                evenStack.push(numero);
            } else if (numero % 2 != 0) {
                oddStack.push(numero);
            }
        }
    }

    static void checkIfIsEmpty(Stack<Integer> pilha) {
        if (!pilha.isEmpty()) {
            int size = pilha.size();
            for (int i = 0; i < size; i++) {
                System.out.print(pilha.pop() + " ");
            }
            System.out.println();
        } else {
            System.out.println("A pilha está vazia.");
        }
    }
    
}
