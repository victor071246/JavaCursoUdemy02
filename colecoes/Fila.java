package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //A diferença entre offer e add é uma simples diferença de comportamento quando a lista está cheia
        fila.add("Ana"); // lança uma exceção
        fila.offer("Bia"); // retorna false
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");


        //Peek e Element -> obter o próximo elemento da fila sem remover

        //A diferença é o comportamento que ocorre quando a fila está vazia
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains();
        // fila.


        // Pool e Remove -> obtém o próximo elemento da fila e o remove
        //retorna o primeir elemento da fila já removendo
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
