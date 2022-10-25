package com.estruturadados.pilhas.exercicios;

import java.util.Stack;

public class Ex06 {

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}[](){}");
        imprimeResultado("{[(]}[](){}");
        imprimeResultado("((A+B)+D)");
        
    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));

    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String expressao) {

        int index = 0;
        char simbolo, topo;
        Stack<Character> pilha = new Stack<>();
        

        while (index < expressao.length()){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) >= 0) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) >= 0) {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    topo = pilha.pop();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }
    
}
