package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		// Exercício 3

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		aluno.name = sc.next();
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();

		System.out.printf("NOTA FINAL: %.2f%n", aluno.finalGrade());
		if (aluno.finalGrade() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS%n", aluno.result());
		} else {
			System.out.println("APROVADO");
		}

		sc.close();
	}

}
