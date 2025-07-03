package br.com.alura;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usando o metodo contains: ");

        System.out.println("Digite uma senha para ver se contem essa senha no banco:  ");
        String frase = scanner.nextLine();

        if (frase.contains("Java")) {
            System.out.println("As palvras sao iguais: " + frase);
        }else{
            System.out.println("As palvras sao diferentes ");
        }
    }
}
