package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program4 {

	public static void main(String[] args) {
		// Exercício 4
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o valor do dólar?");
		double dollarPrice = sc.nextDouble();
			
		System.out.println("Quantos dólares serão comprados?");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		
		sc.close();
	}

}
