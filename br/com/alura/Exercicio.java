package br.com.alura;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailAcess = "admin";
        String senhaAcess = "123";

        System.out.println("Usando o metodo equals");

        System.out.println("Sistema de login");

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        if(email.equals(emailAcess) && senha.equals(senhaAcess)){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
