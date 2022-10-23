package com.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<>();

        arraylist.add("A");
        arraylist.add("B");

        System.out.println(arraylist);
        System.out.println(arraylist.stream().anyMatch("a"::equalsIgnoreCase));
        System.out.println(arraylist.size());

    }
    
}
