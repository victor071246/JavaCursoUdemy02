package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    /*Crie um programa que leia a temperatura em Fahrenheit e converta para Celsius*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();

        double conversaoCelsius = (fahrenheit - 32) / 1.8;

        System.out.println("Valor da conversão em Celsius: " + conversaoCelsius);
    }
}
