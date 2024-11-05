package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraImpl;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) throws IllegalAccessException {

        Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();

        System.out.println(calc.soma(2, 3, 4));


        Field fieldId = calc.getClass().getDeclaredFields()[0];
        fieldId.setAccessible(true);
        fieldId.set(calc, "def");
        fieldId.setAccessible(false);

        System.out.println(calc.getId());
    }
}
