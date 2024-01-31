package EstruturaDeControle;

import java.util.Scanner;

public class ExControlePassageirosWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Peso máximo da aeronave: ");
        int pesoMaximoAeronave = sc.nextInt();

        int pesoTotalPassageiros = 0;

        boolean incluirNovoPassageiro = true;

        while (pesoTotalPassageiros <= pesoMaximoAeronave && incluirNovoPassageiro) {

            System.out.print("Peso do passageiro: ");
            int pesoPassageiro = sc.nextInt();

            pesoTotalPassageiros += pesoPassageiro;

            System.out.print("Incluir novo passageiro? ");
            incluirNovoPassageiro = sc.nextBoolean();

        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximoAeronave);
        System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximoAeronave ? "Peso Excedido" : "Liberado");


    }


}
