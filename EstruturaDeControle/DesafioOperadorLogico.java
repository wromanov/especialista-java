package EstruturaDeControle;

import java.util.Scanner;

public class DesafioOperadorLogico {

    public static void main(String[] args) {
/* As seguintes regras definem se um ano é ou não um ano bissexto:
    •São bissextos todos os anos múltiplos de 400, por exemplo:
    1600, 2000, 2400, etc
    •São bissextos todos os múltiplos de 4 e não múltiplos de 100, por

exemplo:
    1996, 2004, 2008, 2012, etc
    •Não são bissextos todos os demais anos.

Desenvolva um programa que, dado um ano digitado pelo usuário, imprime na
tela se é um ano bissexto ou não.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = sc.nextInt();

        boolean anoBissexto = ano % 400 == 0 ||(ano % 4 == 0 && ano % 100 != 0);

        System.out.println("Ano é bissexto?: " + anoBissexto);






    }


}
