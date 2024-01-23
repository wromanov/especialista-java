package EstruturaDeControle;

import java.util.Scanner;

public class EstruturaCondicionalIF {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;

        Scanner sc = new Scanner(System.in);

        System.out.print("informe o seu peso: ");
        peso = sc.nextDouble();

        System.out.print("informe sual altura: ");
        altura = sc.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.printf("Você está no peso ideal, seu imc é %.2f.%n", imc);
        } else if (imc < 30) {
            System.out.printf("Você está acima do peso, seu imc é %.2f.%n", imc);
        } else if (imc < 35) {
            System.out.printf("Você está Obeso Grau I, seu imc é %.2f.%n", imc);
        } else if (imc < 40) {
            System.out.printf("Você está Obeso Grau II, seu imc é %.2f.%n", imc);
        } else if (imc > 40) {
            System.out.printf("Você está Obeso Grau III, seu imc é %.2f.%n", imc);
        }


    }
}
