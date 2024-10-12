package fundamentos;

public class DesafioPrecedencia {

    public static void main(String[] args) {
        int a = (int) Math.pow ((6 * (3 +2)), 2)/(3*2);
        int b = (int) Math.pow(((1-5) * (2-7))/2, 2);

        int c = (int) Math.pow((a - b), 3);

        int d = (int) Math.pow(10, 3);

        int resultado = c/d;

        System.out.println(resultado);
    }
}
