package exerciciosFixacao.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args){
//        Problema "idades"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/idades.java
//        Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
//        nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String pessoa1, pessoa2;
        int idade1, idade2;
        double media;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        pessoa1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        sc.nextLine(); // --- limpeza de buffer
        pessoa2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();

        media = (idade1 + idade2) / 2.0 ;
        System.out.printf("A idade média de %s e %s é de %.1f anos", pessoa1, pessoa2, media );

    }
}
