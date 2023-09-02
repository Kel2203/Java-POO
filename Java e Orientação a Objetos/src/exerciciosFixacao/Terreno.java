package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args){
//        Problema "terreno"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/terreno.java
//        Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
//        casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
//        o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
//        duas casas decimais


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.print("Digite a largura do terreno (com uma casa decimal): ");
        largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno (com uma casa decimal): ");
        comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado (com duas casas decimais): ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Area do terreno %.1f %n ", area);
        System.out.printf("Preço do terreno %.2f ", preco);



    }


}
