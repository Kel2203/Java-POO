package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args){
//        Problema "retangulo"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/retangulo.java
//        Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
//        da área, perímetro e diagonal deste retângulo, com quatro casas decimais

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;
        System.out.print("Digite a base do retangulo: ");
        base = sc.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;
       // P = 2 (b + h)
        perimetro = 2 * (base + altura);
        // d = raiz quadrada de b ao quadrado + h ao quadrado
        diagonal = Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));

        System.out.printf("AREA = %.4f\n", area);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f", diagonal);
    }
}
