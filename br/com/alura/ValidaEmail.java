package br.com.alura;

import java.util.Scanner;

public class ValidaEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Validador de Email");

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }
    }
}
