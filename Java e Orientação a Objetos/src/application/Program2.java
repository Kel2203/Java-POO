package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		// Exercício 02
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee funcionario = new Employee();

		System.out.println("Nome: ");
		funcionario.name = sc.next();
		System.out.println("Salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Imposto: ");
		funcionario.tax = sc.nextDouble();

		System.out.println();

		System.out.println("Funcionário: " + funcionario);
		System.out.println();
		System.out.println("Qual a porcentagem para aumentar o salário?");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);

		System.out.println();
		System.out.println("Dados atualizados: " + funcionario);

		sc.close();
	}

}
