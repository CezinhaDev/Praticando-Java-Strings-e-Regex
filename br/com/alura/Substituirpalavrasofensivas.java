package br.com.alura;

import java.util.Scanner;

public class SubstituirPalavrasOfensivas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Substituidor de palavras ofensivas");
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        // Expressão regular com palavras ofensivas (separadas por |)
        String regex = "(?i)palavra1|palavra2|palavra3"; // (?i) = case-insensitive

        // Substitui qualquer uma das palavras encontradas por ****
        String textoLimpo = texto.replaceAll(regex, "****");

        System.out.println("\nTexto após a substituição:");
        System.out.println(textoLimpo);
    }
}
