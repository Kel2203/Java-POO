package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args){
//    Problema "troco"
//    Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/troco.java
//    Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
//    O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
//    e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
//    mostrar o valor do troco a ser devolvido ao cliente.


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double preco, valor, troco;
    int quantidade;
    System.out.print("Preço unitário do produto: ");
    preco = sc.nextDouble();

    System.out.print("Quantidade comprada: ");
    quantidade = sc.nextInt();

    System.out.print("Dinheiro recebido: ");
    valor = sc.nextDouble();

    troco = valor - (preco * quantidade) ;
    System.out.printf("TROCO: %.2f", troco );
 }
}