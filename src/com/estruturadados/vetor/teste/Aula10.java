package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula10 {

    public static void main(String[] args) {

        Contato c1 = new Contato("Lukas");
        Contato c2 = new Contato("Natalia");
        Contato c3 = new Contato("Ana");

        Vetor vetor = new Vetor(5);

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);

        int pos = vetor.buscaElemento(c3);
        if (pos >= 0) {
            System.out.println("Elemento existe no vetor.");
        } else {
            System.out.println("Elemento não existe no vetor.");
        }
        

    }
    
}
