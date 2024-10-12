package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        // Domingo -> 1
        // terça -> 3
        // quarta -> 4

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do dia: ");

        String dia = entrada.next();

        if(dia.equalsIgnoreCase("domingo") ){
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda-feira")) {
            System.out.println(2);
        }
        else if (dia.equalsIgnoreCase("terça-feira")){
            System.out.println(3);
        }

        else if (dia.equalsIgnoreCase("quarta-feira")){
            System.out.println(4);
        }

        else if (dia.equalsIgnoreCase("quinta-feira")){
            System.out.println(5);
        }
        else if (dia.equalsIgnoreCase("sexta-feira")){
            System.out.println(6);
        }
        else if (dia.equalsIgnoreCase("sábado")){
            System.out.println(7);
        }
        else {
            System.out.println("Dia inválido!!!");
        }


        entrada.close();
    }
}
