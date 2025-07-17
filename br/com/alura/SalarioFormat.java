package br.com.alura;

import java.util.Scanner;

public class SalarioFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Formatação de Salário");

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble(); // agora lendo como número

        String salarioFormatado = String.format("Salário: R$ %.2f", salario); // formata o salário com duas casas decimais
        System.out.println(salarioFormatado);
    }
}
