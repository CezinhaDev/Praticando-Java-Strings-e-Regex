package br.com.alura;

import java.util.Scanner;

public class MostrarIniciais {
    // Use split(" ") e charAt(0).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mostrando as iniciais de cada palavra");

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        String[] partes = nomeCompleto.split(" ");
        String iniciais = "";
        for (String parte : partes) {
            iniciais += parte.charAt(0) + " ";
        }
        System.out.println("Suas iniciais são: " + iniciais);
    }
}
