package oo.heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y){
        super(0, y);
    }

    @Override
    public boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque2 || ataque1 || ataque3;
    }
}
