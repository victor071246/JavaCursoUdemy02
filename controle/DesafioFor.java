package controle;

public class DesafioFor {
    public static void main(String[] args) {

        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço

        for(String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
