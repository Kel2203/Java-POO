package exerciciosFixacao;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
//        Problema "soma"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma.java
//        Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
//        números.

        Scanner sc = new Scanner(System.in);
        int x , y, soma;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        soma = x + y;
        System.out.println("SOMA: " + soma);
    }
}
