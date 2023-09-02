package exerciciosFixacao;

import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
//        Problema "duracao"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/duracao.java
//        Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
//        formato horas:minutos:segundos.

        Scanner sc = new Scanner(System.in);
        int duracao, horas, minutos, segundos, resto;

        System.out.print("Digite a duracao em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        resto = duracao % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
