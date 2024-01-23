package EstruturaDeControle;

public class OperadorCurtoCircuito {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c = 10;
        int d = 20;

        // Esse operador "|" verifica apenas a primeira condição, se esta for verdadeira, já para a operação.
        boolean resultado = a == 10 || b++ == 20;

        // Esse operador "||" verifica as duas condições, mesmo que a primeira seja verdadeira.
        boolean resultado2 = c == 10 | d++ == 20;
        System.out.println(resultado);
        System.out.println(a);
        System.out.println(b);

        System.out.println(resultado2);
        System.out.println(c);
        System.out.println(d);


    }






}
