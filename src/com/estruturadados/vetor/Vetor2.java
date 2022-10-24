package com.estruturadados.vetor;

import com.estruturadados.base.EstruturaEstatica;

public class Vetor2<T> extends EstruturaEstatica <T> {

    public Vetor2(){
        super();
    }

    public Vetor2(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);

    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    public int tamanho() {
        return super.tamanho();
    }

    public String toString() {
        return super.toString();
    }

    public void remove(T elemento){
        int posicao = buscaIndex(elemento);

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1]; 
        }
        tamanho--;

    }

    public int buscaIndex(T object) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(object)) { 
                return i;
            }
        }
        return -1;
    }

    public T buscaElementoIndex(int posicao) {
        if (posicao >= 0 && posicao < this.tamanho) {
            return this.elementos[posicao];
        } else {
            return null;
        }
    }

    public boolean buscaElemento(T object) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(object)) { 
                return true;
            }
        }
        return false;
    }

    public int ultimoIndice(T object) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(object)) {
                return i;
            } 
        }
        return -1;
    }

    @SuppressWarnings("unchecked")                      
    public void limpar() {
        this.elementos = (T[]) new Object[this.elementos.length];
    }
    
}
