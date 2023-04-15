package aula_java_project;
import java.util.Scanner;
public class exercicios_01 {
 //Exercicio 01
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento,valor,area, preco;
		
		System.out.println("Digite a largura do terreno: " );
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite 0 valor do terreno: " );
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		System.out.printf("Area do terreno %.2f%n", area);
		
		preco = area * valor;
		System.out.printf("Preco do terreno %.2f%n", preco);
		
		sc.close();
	}
	
}
