package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    // 1. Crie um programa que verifica se um número é par ou não
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número entre 0 e 10: ");

        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10){
            if(numero % 2 == 0){
                System.out.println("Número é par!");
            }
            else{
                System.out.println("Número não é par");
            }
        }
        else {
            System.out.println("Número inválido!");
        }

        entrada.close();
    }
}
