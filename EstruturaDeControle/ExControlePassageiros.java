package EstruturaDeControle;

import java.util.Scanner;

public class ExControlePassageiros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Peso máximo da aeronave: ");
        int pesoMaximoAeronave = sc.nextInt();

        System.out.print("Quantidade de passageiros: ");
        int totalPassageiros = sc.nextInt();

        int pesoTotalPassageiros = 0;

        for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {

            System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
            int pesoPassageiro = sc.nextInt();

            pesoTotalPassageiros += pesoPassageiro;

        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximoAeronave);
        System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximoAeronave ? "Peso Excedido" : "Liberado");


    }

}
