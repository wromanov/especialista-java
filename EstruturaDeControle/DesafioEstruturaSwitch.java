package EstruturaDeControle;

import java.util.Scanner;

public class DesafioEstruturaSwitch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        double taxaJuros = switch (quantidadeParcelas) {
            case 1, 2 -> 0.0199;
            case 3 -> 0.0299;
            default -> 0.0399;
        };

        double tarifaFixa = valorEmprestimo >= 100 ? 1.50 : 0;

        double totalJuros = valorEmprestimo * (taxaJuros * quantidadeParcelas);

        double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

        System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
        System.out.printf("Total de juros: R$%.2f%n", totalJuros);
        System.out.printf("Custo total: R$%.2f%n", custoTotal);
    }


}

