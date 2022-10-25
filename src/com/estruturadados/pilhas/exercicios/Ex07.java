package com.estruturadados.pilhas.exercicios;

import java.util.Stack;

public class Ex07 {

    public static void main(String[] args) {

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(6);
        imprimeResultado(8);
        imprimeResultado(10);
        imprimeResultado(12);
        imprimeResultado(25);

    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero) {

        Stack<Integer> stack = new Stack<>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            stack.push(resto);
            numero /= 2;

        }

        while (!stack.isEmpty()) {
            numBinario += stack.pop();
        }

        return numBinario;
    }
    
}
