package EstruturaDeControle;

public class PrecedenciaOperadoresLogicos {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //A expressão é avaliada pela JVM da direita para esquerda da forma que está disposta os dois exemplos.

        boolean resultado = x == 13 && x == 15 || y == 20;

        boolean resultado2 = (x == 13 && x == 15) || y == 20;

        System.out.println(resultado);
        System.out.println(resultado2);

    }
}
