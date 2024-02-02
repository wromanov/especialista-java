package EstruturaDeControle;

import java.util.Scanner;

public class DesafioForIniciante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        for (int i= 0; i < 10; i++) {
            System.out.print("Informe o valor a ser somado: ");
            numero = sc.nextInt();

            soma += numero;

        }

        System.out.print("Valor somado: " + soma);




    }




}
