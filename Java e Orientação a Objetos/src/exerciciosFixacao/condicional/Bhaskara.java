package exerciciosFixacao.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
//        Problema "baskara"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/baskara.java
//        Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
//        de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
//       Se a equação não possuir raízes reais, mostrar uma mensagem.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      double coeficienteA, coeficienteB, coeficienteC, x1, x2, delta;

        System.out.print("Coeficiente a: ");
        coeficienteA = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        coeficienteB = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        coeficienteC = sc.nextDouble();
        delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);

        if(delta < 0 ){
            System.out.println("Esta equacao nao possui raizes reais!");
        }else{
            x1 = ((-coeficienteB) + Math.sqrt(delta)) / ( 2 * coeficienteA);
            x2 = (( -coeficienteB) - Math.sqrt(delta)) / ( 2 * coeficienteA);
            System.out.printf("X1: %.4f\n", x1);
            System.out.printf("X2: %.4f\n", x2);
        }
    }
}
