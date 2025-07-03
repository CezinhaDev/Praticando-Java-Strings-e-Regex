package br.com.alura;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usando o metodo Replace()");
        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

        frase = frase.replace("teste", "substituído");

        System.out.println("Frase modificada: " + frase);
    }
}
