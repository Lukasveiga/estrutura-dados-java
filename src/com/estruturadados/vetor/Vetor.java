package com.estruturadados.vetor;

public class Vetor {

    private Object[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } 
        return false;
        
    }

    public boolean adiciona(int posicao, Object elemento){
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i]; 
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remove(Object elemento){
        int posicao = buscaElemento(elemento);

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1]; 
        }
        tamanho--;

    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public Object busca(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    public int buscaElemento(Object object) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(object)) { 
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i] + ", ");
        }
        sb.append(this.elementos[this.tamanho - 1] + "]");
        return sb.toString();
    }
}
