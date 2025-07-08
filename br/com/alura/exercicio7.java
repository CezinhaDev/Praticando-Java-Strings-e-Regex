package br.com.alura;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usando o metodo toUpperCase() e toLowerCase()");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nome em letras maiúsculas: " + nome.toUpperCase());
        System.out.println("Nome em letras minúsculas: " + nome.toLowerCase());

    }
}
