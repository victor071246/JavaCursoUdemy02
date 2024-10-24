package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
        try {

            System.out.println(7 / entrada.nextInt());
            entrada.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalmente...");
        }

        try {

            System.out.println(7 / entrada.nextInt());
            entrada.close();
        } finally {
            System.out.println("Finalmente 2...");
            entrada.close();
        }
        System.out.println("Fim!");
    }
}
