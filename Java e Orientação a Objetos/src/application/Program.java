package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// Exercício 1

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Entre com a largura e altura do retângulo:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERÍMETRO = %.2f%n", r.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		
		sc.close();
	}

}
