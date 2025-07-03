package br.com.alura;

import java.util.Scanner;

public class Execicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usando metodo equals");

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu nome novamente");
        String nomeDeNovo = scanner.nextLine();

        if(nome.equals(nomeDeNovo)){
            System.out.println("Os nome sao iguais");
        }else{
            System.out.println("Os nome sao diferentes, tente novamente");
        }

        System.out.println(nome + ":" + nomeDeNovo);


    }
}
