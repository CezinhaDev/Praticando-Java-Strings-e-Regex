package br.com.alura;

import java.util.Scanner;

public class Execicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Usando o metodo SubString");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        String primeiroNome = nome.substring(0);
        System.out.println(primeiroNome);
    }
}
