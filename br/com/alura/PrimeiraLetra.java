package br.com.alura;

import java.util.Scanner;

public class PrimeiraLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usando o subString e toUpperCase()");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        String primeiraLetra = nome.substring(0, 1).toUpperCase();
        System.out.println("A primeira letra do seu nome é: " + primeiraLetra.toUpperCase());
    }
    
}
