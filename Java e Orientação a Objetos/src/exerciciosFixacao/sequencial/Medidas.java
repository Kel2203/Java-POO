package exerciciosFixacao.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
//        Problema "medidas"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/medidas.java
//        Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
//        com quatro casas decimais):
//        a) a área do quadrado que tem lado A
//        b) a área do triângulo retângulo que base A e altura B
//        c) a área do trapézio que tem bases A e B, e altura C

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, quadrado, triangulo, trapezio;
        System.out.print("Digite a medida A: ");
        A = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        B = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        C = sc.nextDouble();

        quadrado = A * A;
        triangulo = (A * B) / 2;
        trapezio = ((A + B) * C) / 2;

        System.out.printf("AREA DO QUADRADO: %.4f\n", quadrado);
        System.out.printf("AREA DO TRIANGULO: %.4f\n", triangulo);
        System.out.printf("AREA DO TRAPEZIO: %.4f ", trapezio);
    }
}
