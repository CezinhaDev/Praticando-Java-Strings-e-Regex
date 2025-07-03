package br.com.alura;

public class Principal {
    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = ""
                + "Pós-graduada em Engenharia e "
                + "Arquitetura de Software; "
                + "Desenvolvedora backend Java desde 2010; "
                + "";

        String texto = String.format("Disciplina: %s - %s", disciplina, professor);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor.replace("CESAR", "HENRIQUE"), disciplina);
        System.out.println("\n" + curriculo);

        // metodos de manipulaçao
        // .trim() --> remove os espaços em branco

        // .toLowerCase() → Converte todos os caracteres da string para minúsculo
        // .toUpperCase() → Converte todos os caracteres da string para maiúsculo
        // .replace() → Substitui partes da string por outra string
        // Exemplo: "Olá Mundo".replace("Mundo", "Java") → "Olá Java"
        // Também pode ser usado para remover: texto.replace("a", "") → remove todas as
        // letras 'a'
        // charAt usado para pegar um caracter especifico de uma posicao
        // substring usado para indicar apenas um trecho ex: posicao 0 ate a 3
        // contains() usado para verficar se dentro do texto tem palavra chave
        // startsWith() usado para saber se uma palavra comeca com caractereses
        // endsWith() usado para verficar os caracteres finais
        // equals usado para sabe se as string sao iguais
        //lastIndexOf . Ele retorna a posição da última ocorrência de um caractere

        // ----------------------------------------------------
        // Exemplo:
        // String nome = "Cesar Henrique";
        // System.out.println(nome.toLowerCase()); // sairá: cesar henrique
        // System.out.println(nome.toUpperCase()); // sairá: CESAR HENRIQUE

        // ----------------------------------------------
        // Caracteres de formatação (usados com printf ou String.format)
        // ----------------------------------------------
        // %s → Substitui uma string (ex: nome, texto)
        // %d → Substitui um número inteiro (ex: idade, quantidade)
        // %f → Substitui um número decimal (float/double)
        // %n → Quebra de linha (melhor que \n, pois é multiplataforma)
        // %.2f → Formata um número decimal com 2 casas decimais (ex: 10.45)
        // ----------------------------------------------
        // Exemplo de uso:
        // System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f", nome, idade, altura);

    }
}