package com.estruturadados.fila;

import java.util.PriorityQueue;
import java.util.Queue;

import com.estruturadados.fila.testPacientePrioridade.Paciente;

public class ApiQueuePriority {

    public static void main(String[] args) {

        Queue<Paciente> fila = new PriorityQueue<>();

        fila.add(new Paciente("A", 2));
        fila.add(new Paciente("B", 1));

        System.out.println(fila);
        
    }
    
}
