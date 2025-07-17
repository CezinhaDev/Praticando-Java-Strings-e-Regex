package br.com.alura;

import java.util.Scanner;

public class EscondeCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escondendo CPF");

        System.out.println("Digite seu CPF (formato xxx.xxx.xxx-xx):  ");

        String cpf = scanner.nextLine();
        if (cpf.length() == 14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
            String cpfEscondido = cpf.substring(0, 3) + ".***.***-" + cpf.substring(12);
            System.out.println("CPF escondido: " + cpfEscondido);
        } else {
            System.out.println("CPF inválido. Certifique-se de que está no formato xxx.xxx.xxx-xx");
        }
        scanner.close();    
}
}
