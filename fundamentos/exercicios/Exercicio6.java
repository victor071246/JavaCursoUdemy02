package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    /*Resolve Báskhara */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do a: ");
        double a = scanner.nextDouble();

        System.out.print("Insira o valor do b: ");
        double b = scanner.nextDouble();

        System.out.print("Insira o valor do c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;
        scanner.close();

        System.out.printf("X1 = %.0f e X2 = %.0f ", x1, x2);
    }
}
