package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // retorna null
        System.out.println(livros.pop()); // retorna uma exceção

//        System.out.println(livros.remove());
//
//        livros.size();
//        livros.clear();
//        livros.contains()
//        livros.isEmpty()

        for(String livro: livros){
            System.out.println(livro);
        }
    }
}
