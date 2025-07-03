package br.com.alura;

import java.util.Scanner;

public class Exercico6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Acesso ao Adm");

        System.out.println("Digite o email");
        String email = scanner.nextLine();

        System.out.println("Digite a senha");
        int senha = scanner.nextInt();

        if(email.startsWith("admin")){
            System.out.println("O email esta certo " + email);
        }

        // Converta a senha para String antes de usar endsWith
        if (String.valueOf(senha).endsWith("123")) {
            System.out.println("A senha termina com 123");
        }
    }
}
