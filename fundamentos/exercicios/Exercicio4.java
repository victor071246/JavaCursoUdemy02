package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    /* 4. Crie um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        double valor = scanner.nextDouble();

        scanner.close();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("\n O valor é %.0f, seu quadrado é %.0f e seu cubo é %.0f", valor, quadrado, cubo);

    }
}
