package com.estruturadados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class ApiFila {

    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {
            fila.add(i);
        }

        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);
    }
    
}
