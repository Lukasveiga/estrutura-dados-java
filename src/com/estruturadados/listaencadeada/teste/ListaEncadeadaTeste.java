package com.estruturadados.listaencadeada.teste;

import com.estruturadados.listaencadeada.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println(lista);

    }
}
