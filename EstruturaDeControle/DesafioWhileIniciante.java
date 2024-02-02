package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhileIniciante {
    public static void main(String[] args) {
        /* Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma
        todos os números informados.
        O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas
        quando o valor total somado for igual ou superior a 100. */

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        while (true) {

            System.out.print("Informe o número a ser somado: ");
            numero = sc.nextInt();

            soma += numero;

            if(soma >= 100){
                System.out.println("A soma superou o valor 100.");
                break;
            }

        }

        System.out.println("Soma total: " + soma);

    }
}
