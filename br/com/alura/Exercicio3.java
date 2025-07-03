package br.com.alura;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usando o metodo CharAt");

        System.out.println("Digite uma frase ou nome: ");

        String nomeFrase = scanner.nextLine();

        System.out.println("O primeiro caractere é : " + nomeFrase.charAt(0));
        
    }
}
