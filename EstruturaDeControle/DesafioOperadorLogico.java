package EstruturaDeControle;

import java.util.Scanner;

public class DesafioOperadorLogico {

    public static void main(String[] args) {

        /*Dica de matemática: para saber se um número é múltiplo de outro, basta realizar
        o cálculo de módulo (resto da divisão). Um número é múltiplo de outro se o
        módulo for igual a 0.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = sc.nextInt();

        boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        System.out.println("Ano é bissexto?: " + anoBissexto);


    }


}
