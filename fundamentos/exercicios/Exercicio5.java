package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {

/*5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("\nInsira o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura / 2;

        System.out.println("O valor da área do triângulo é de: " + area);
    }
}
