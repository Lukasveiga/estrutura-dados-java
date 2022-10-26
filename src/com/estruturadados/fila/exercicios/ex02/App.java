package com.estruturadados.fila.exercicios.ex02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    static private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<Senha> filaNormal = new LinkedList<>();
        Queue<Senha> filaPreferencial = new LinkedList<>();

        for (int i = 0; i < 6; i++) {
            retirarSenha(filaNormal, filaPreferencial);
        }

        chamarSenha(filaNormal, filaPreferencial);
    }

    private static void retirarSenha(Queue<Senha> filaNormal, Queue<Senha> filaPreferencial) {
        System.out.println("Selecione o tipo de senha:\n" + "1 - Normal\n" + "2 - Prioritária");
        int opcao = scan.nextInt();
        scan.nextLine();

        if (opcao == 1) {
            filaNormal.add(new Senha(2));
        } else if (opcao == 2) {
            filaPreferencial.add(new Senha(1));
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void chamarSenha(Queue<Senha> filaNormal, Queue<Senha> filaPreferencial) {

        final int MAX_PRIORIDADE = 3;

        while (!filaNormal.isEmpty() || !filaPreferencial.isEmpty()) {

            int count = 0;

            while (!filaPreferencial.isEmpty() && count < MAX_PRIORIDADE) {
                chamada(filaPreferencial);
                count++;
            }

            if (!filaNormal.isEmpty()) {
                chamada(filaNormal);
            }

            if (filaPreferencial.isEmpty()) {
                while (!filaNormal.isEmpty()) {
                    chamada(filaNormal);
                }
            }


        }

    }

    private static void chamada(Queue<Senha> fila) {
        System.out.println("Senha número: " + fila.remove().getNumero());
    }

}