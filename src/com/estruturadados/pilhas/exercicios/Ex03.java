package com.estruturadados.pilhas.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack<Livro> livros = new Stack<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o nome do livro: ");
            String nome = scan.nextLine();
            System.out.println("Insira o isbn do livro: ");
            String isbn = scan.nextLine();
            System.out.println("Insira o ano do livro: ");
            int ano = scan.nextInt();
            scan.nextLine();
            System.out.println("Insira o autor do livro: ");
            String autor = scan.nextLine();

            livros.add(new Livro(nome, isbn, ano, autor));
        }

        System.out.println(livros);
        System.out.println(livros.peek());
        System.out.println(livros.pop());
        System.out.println(livros);

        scan.close();
        
    }

    private static class Livro {

        private String nome;
        private String isbn;
        private int anoLancamento;
        private String autor;
        
        public Livro(String nome, String isbn, int anoLancamento, String autor) {
            this.nome = nome;
            this.isbn = isbn;
            this.anoLancamento = anoLancamento;
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "Livro [nome=" + nome + ", isbn=" + isbn + ", anoLancamento=" + anoLancamento + ", autor=" + autor
                    + "]";
        }

        
    }
    
}
