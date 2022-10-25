package com.estruturadados.fila;

public class FilaTeste {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        for (int i = 0; i < 10; i++) {
            fila.enfileira(i);
        }

        System.out.println(fila);
        System.out.println(fila.espiar());
        System.out.println(fila.desenfileira());
        System.out.println(fila);
        System.out.println(fila.espiar());
        
    }
    
}
