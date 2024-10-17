package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length ; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", j+1, i+1);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é " + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDaTurma));

        }


        entrada.close();
    }
}
