package com.estruturadados.fila;

public class TesteFilaPrioridade {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        for (int i = 5; i > 0; i--) {
            fila.enfileira(i);
        }


        System.out.println(fila);

    }

}
