package com.estruturadados.fila.exercicios.ex03;

import java.util.Queue;

public class PSAtendimento implements Runnable{

    private Queue<Pessoa> fila;

    public PSAtendimento(Queue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        
        while (!fila.isEmpty()) {
            System.out.println(fila.remove() + " atendida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendiment concluido.");
    }
    
}
