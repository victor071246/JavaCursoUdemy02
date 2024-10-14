package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a nota 1: ");
        double nota1 = entrada.nextDouble();


        System.out.print("Insira a nota 2: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        boolean aprovado = media >= 7;
        boolean recuperacao = media <7 && media >4;
        boolean reprovado = media <= 4;

        if (aprovado){
            System.out.println("\nAprovado!!!");
        }
        else if(recuperacao){
            System.out.println("\nRecuperação");
        }
        else if(reprovado){
            System.out.println("\nReprovado!!!");
        }
        else {
            System.out.println("Opa, algo deu errado");
        }


        entrada.close();
    }
}
