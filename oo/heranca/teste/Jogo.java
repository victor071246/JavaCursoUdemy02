package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;

        Heroi j2 = new Heroi(10, 12);
        j2.x = 10;
        j2.y = 11;


        System.out.println("Monstro tem => " + j1.vida + " pontos de vida");
        System.out.println("Jogador tem => " + j2.vida + " pontos de vida");

        j2.atacar(j1);
        j1.atacar(j2);

        j2.atacar(j1);
        j1.atacar(j2);


        j2.andar(Direcao.NORTE);
        j2.atacar(j1);
        j1.atacar(j2);

        System.out.println("Monstro tem => " + j1.vida + " pontos de vida");
        System.out.println("Jogador tem => " + j2.vida + " pontos de vida");
    }
}
