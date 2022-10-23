package com.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.estruturadados.vetor.VetorGenerico;

public class ex05 {

    public static void main(String[] args) {
        
        // Implementar o método limpar

        VetorGenerico<Integer> vetor = new VetorGenerico<Integer>();

        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(10);
        vetor.adiciona(30);
        vetor.adiciona(60);
        vetor.adiciona(10);

        System.out.println(vetor);

        vetor.limpar();

        System.out.println(vetor);

        ArrayList<Integer> vetor2 = new ArrayList<>();
        vetor2.add(10);
        vetor2.add(20);
        vetor2.add(10);
        vetor2.add(30);
        vetor2.add(60);
        vetor2.add(10);

        System.out.println(vetor2);

        vetor2.clear();
        System.out.println(vetor2);
    }
    
}
