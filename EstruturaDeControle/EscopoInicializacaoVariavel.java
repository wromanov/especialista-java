package EstruturaDeControle;

import java.util.Scanner;

public class EscopoInicializacaoVariavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Infome o preço do produto: ");
        double precoProduto = sc.nextDouble();

        System.out.print("Cobrar Frete: ");
        boolean cobrarFrete = sc.nextBoolean();

        double valorFrete = 0; //Todas os tipos primitivos devem ser inicializados com um valor.

        if (cobrarFrete) {
            System.out.printf("Valor do Frete: ");
            valorFrete = sc.nextDouble(); //Variável de escopo local
        }

        double valorTotal = precoProduto + valorFrete; //Variável de escopo global

        System.out.printf("Valor total: R$%.2f%n", valorTotal);

    }
}
