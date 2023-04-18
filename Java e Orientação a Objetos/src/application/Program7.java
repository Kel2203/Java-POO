package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// Exercício 7
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
			- Imprimir todos os elementos do vetor
			- Mostrar na tela a soma e a média dos elementos do vetor */
		
		int num;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		num = sc.nextInt();
		
		double[] vetor = new double[num];
		
		for ( int i=0; i<num; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		for (int i=0; i<num; i++) {
			soma += vetor[i];
		}
		
		media = soma / num;
		System.out.printf("VALORES = ");
		
		for (int i=0;i<num; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", media);
		
		
		sc.close();
		

	}

}
