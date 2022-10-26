package com.estruturadados.fila.exercicios.ex03;

import java.util.PriorityQueue;
import java.util.Queue;

enum Prioridades{
    VERDE(2), AMARELO(1), VERMELHO(0);

    private final int prioridade;

    Prioridades(int prioridade) {
        this.prioridade  = prioridade;
    }

    public int getValor(){
        return this.prioridade;
    }
}

public class Ex03 {

    public static void main(String[] args) {

        Queue<Pessoa> fila = new PriorityQueue<>();

        fila.add(new Pessoa("1", Prioridades.VERDE));
        fila.add(new Pessoa("2", Prioridades.AMARELO));
        fila.add(new Pessoa("3", Prioridades.VERMELHO));
        fila.add(new Pessoa("4", Prioridades.VERDE));
        fila.add(new Pessoa("5", Prioridades.VERDE));
        fila.add(new Pessoa("6", Prioridades.VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }

}
