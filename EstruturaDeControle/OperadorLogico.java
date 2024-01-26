package EstruturaDeControle;

import java.util.Scanner;

public class OperadorLogico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cortisol: ");
        double cortisol = sc.nextDouble();


        // Operador && (and) - Todas as condições devem ser verdadeiras, para o resultado ser verdadeiro.
        boolean cortisolNormal = cortisol >= 6 && cortisol <= 18.4;

        //boolean cortisolAnormal = !(cortisol >= 6 && cortisol <= 18.4); // Negação - Nega o resultado, invertendo o valor.

        // Operador || (or) - Pelo menos uma condição deve ser verdadeira, para o resultado ser verdadeiro.
        boolean cortisolAnormal = cortisol < 6 || cortisol > 18.4;

        System.out.printf("Cortisol normal: %b %n", cortisolNormal);
        System.out.printf("Cortisol Anormal: %b %n", cortisolAnormal);


    }


}
