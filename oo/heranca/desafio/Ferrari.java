package oo.heranca.desafio;

public class Ferrari extends  Carro{

    public Ferrari(){
        this(315);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 350;
    }

//    @Override
//    void acelerar() {
//        velocidadeAtual += 15;
//    }


}
