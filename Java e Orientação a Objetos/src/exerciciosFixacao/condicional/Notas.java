package exerciciosFixacao.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[]args){
//        Problema "notas"
//        Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/notas.java
//        Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
//        uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
//        ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
//        mensagem "REPROVADO"

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, notaFinal;
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
        if(notaFinal <= 60.00){
            System.out.println("REPROVADO");
        }
    }
}
