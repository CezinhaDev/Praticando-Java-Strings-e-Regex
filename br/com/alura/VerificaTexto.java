package br.com.alura;

import java.util.Scanner;

public class VerificaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifica se contem uma palavra específica");
        

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        if(texto.contains("java")){ // container verifica se o texto contém a palavra "java"
            System.out.println("O texto contém a palavra 'java'");
        }else{
            System.out.println("O texto não contém a palavra 'java'");
        }
    }
}
