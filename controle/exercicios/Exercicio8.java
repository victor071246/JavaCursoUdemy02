package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorNumero = 1;
        int maiorvalor = 0;

        while (contadorNumero <= 10){
            System.out.print("Insira um número: ");
            int numero = entrada.nextInt();
            System.out.println();
            if (numero > maiorvalor){
                maiorvalor = numero;

            }
            contadorNumero++;
        }
        System.out.println("O maior valor digitado foi: " + maiorvalor);

        entrada.close();
    }
}
