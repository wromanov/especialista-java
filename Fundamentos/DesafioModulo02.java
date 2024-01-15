package Fundamentos;

import java.util.Scanner;

public class DesafioModulo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor01, valor02, valor03;
        double mediaCompras;

        System.out.print("Informe o primeiro valor da compra: ");
        valor01 = sc.nextDouble();

        System.out.print("Informe o segundo valor da compra: ");
        valor02 = sc.nextDouble();

        System.out.print("Informe o segundo valor da compra: ");
        valor03 = sc.nextDouble();

        mediaCompras = (valor01 + valor02 + valor03) /2;

        System.out.printf("Valor das compras R$%.2f R$%.2f R$%.2f, media das compras R$%.2f.", valor01, valor02, valor03, mediaCompras);






    }


}
