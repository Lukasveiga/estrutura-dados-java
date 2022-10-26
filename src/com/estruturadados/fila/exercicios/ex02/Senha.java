package com.estruturadados.fila.exercicios.ex02;

public class Senha{// implements Comparable<Senha>{

    static private int count = 1;
    private String numero;
    private int prioridade;

    public Senha(int prioridade) {
        this.prioridade = prioridade;
        if (prioridade == 1) {
            this.numero = "P" + (count++);
        } else if (prioridade == 2) {
            this.numero = "N" + (count++);
        }
        
    }

    public String getNumero() {
        return numero;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
