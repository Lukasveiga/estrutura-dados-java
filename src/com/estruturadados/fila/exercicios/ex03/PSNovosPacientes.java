package com.estruturadados.fila.exercicios.ex03;

import java.util.Queue;
import java.util.Random;

public class PSNovosPacientes implements Runnable{

    private Queue<Pessoa> fila;
    private int count = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(Queue<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 8; i++) {

            try {
                Thread.sleep(8000);
                Prioridades[] prioridades = Prioridades.values();
                Pessoa p = new Pessoa("" + count, prioridades[prioridade.nextInt(prioridades.length)]);
                fila.add(p);
                count++;
                System.out.println(p + " enfileirada");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

}
