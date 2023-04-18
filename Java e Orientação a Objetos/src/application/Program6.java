package application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// Exercícios 6
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
		
		
		int num;
		System.out.print("Quantos numeros voce vai digitar? ");
		num = sc.nextInt();
		
		int[] vetor = new int[num];
		
		for (int i=0; i< num; i++ ) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i<num; i++) {
			if (vetor[i] < 0) {
	        	System.out.printf("%d\n", vetor[i]);
	        }
		}
		
		
		
		sc.close();

	}

}
