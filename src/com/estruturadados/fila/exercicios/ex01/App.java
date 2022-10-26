package com.estruturadados.fila.exercicios.ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<Documento> documentos = new LinkedList<>();

        boolean quit = false;
        int action;

        do {
            showMenu();
            System.out.println("Selecione uma opção: ");
            action = scan.nextInt();
            scan.nextLine();
            
            switch (action) {
                case 1:
                    cadastroDocumentos(documentos);
                    break;
                case 2:
                    imprimeDocumento(documentos);
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    quit= true;
                    break;
                default:
                    System.out.println("Informe uma opção válida.");
                    break;
            }


        } while (!quit);

        
    }

    private static void cadastroDocumentos(Queue<Documento> documentos){
        String nome;
        int numPaginas;
        System.out.println("Informe o nome do documento: ");
        nome = scan.nextLine();

        System.out.println("Infome o número de páginas do documento " + nome + ": ");
        numPaginas = scan.nextInt();
        scan.nextLine();

        documentos.add(new Documento(nome, numPaginas));
    }

    private static void imprimeDocumento(Queue<Documento> documentos) {
        while (!documentos.isEmpty()) {
            Documento documento = documentos.remove();
            System.out.println("Imprimindo documento " + documento.getNome() + "...");
            for (int j = 1; j <= documento.getNumPaginas(); j++) {
                System.out.println("Imprimindo: página " + j);
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
        }
        System.out.println("Todos os documentos foram impressos.");
    }

    private static void showMenu(){
        System.out.println("1 - Cadastrar documento\n" +
                           "2 - Imprimir documentos\n" +
                           "3 - Desligar impressora.");
    }
    
}
