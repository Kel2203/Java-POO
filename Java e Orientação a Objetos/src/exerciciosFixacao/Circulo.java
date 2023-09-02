package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
//        Problema "circulo"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/circulo.java
//        Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
//        círculo com três casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PI = 3.1416;
        double raio, area;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = sc.nextFloat();

        area = PI * Math.pow( raio, 2);

        System.out.printf("AREA: %.3f", area);

    }
}
