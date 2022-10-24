package com.estruturadados.pilhas.exercicios;

import java.util.Stack;

public class Ex05 {

    public static void main(String[] args) {

        String word = "sopapos";
        
        if(isPalindrome(word)){
            System.out.println(word + " é um palíndromo.");
        } else {
            System.out.println(word + " não é um palíndromo.");
        }
        
    }

    static boolean isPalindrome(String word) {

        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        String[] parts = word.split("");

        for (int i = 0; i < parts.length; i++) {
            stack.push(parts[i]);
        }

        int size = stack.size();

        for (int i = 0; i < size/2; i++) {
            stack2.push(stack.pop());
        }

        if (parts.length % 2 != 0) {
            stack.pop();
        }

        return stack.equals(stack2);
    }
    
}
