package Fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        double peso;

        System.out.print("Qual seu nome: ");
        nome = sc.nextLine(); //Paralisa e espera uma próxima linha.

        System.out.print("Qual seu idade: ");
        idade = sc.nextInt();

        System.out.print("Qual seu altura: ");
        altura = sc.nextDouble();

        System.out.print("Qual seu peso: ");
        peso = sc.nextDouble();

        System.out.printf("Oi, %s, tudo bem?\n",nome);
        System.out.printf("Seu Peso: %.2f, Sua altura: %.2f, Sua idade: %d.\n",peso, altura, idade);

        sc.close();
    }

}
