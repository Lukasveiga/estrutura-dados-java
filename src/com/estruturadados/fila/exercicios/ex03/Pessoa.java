package com.estruturadados.fila.exercicios.ex03;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private Prioridades prioridade;
    
    public Pessoa() {
    }

    public Pessoa(String nome, Prioridades prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prioridades getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridades prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Pessoa [Nome= " + nome + ", Prioridade= " + prioridade + "]";
    }

    @Override
    public int compareTo(Pessoa o) {

        if (this.prioridade.getValor() > o.prioridade.getValor()) {
            return 1;
        } else if (this.prioridade.getValor() < o.prioridade.getValor()) {
            return -1;
        } else {
            return 0;
        }
        
        //return Integer.valueOf(this.prioridade.getValor()).compareTo(o.getPrioridade().getValor());
    }

}
