package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    /*Crie um programa que leia o peso e a altura do usuário, imprimindo na tela o imc*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();


        System.out.println("\nDigite o peso: ");
        double peso = scanner.nextDouble();

        scanner.close();

        double imc = peso / Math.pow(altura,2);

        System.out.println("IMC: " + imc);



    }
}
