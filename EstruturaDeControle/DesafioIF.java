package EstruturaDeControle;

import java.util.Scanner;

public class DesafioIF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char sexo;
        double peso;
        double altura;
        double imc;

        System.out.print("Qual seu sexo: ");
        sexo = sc.next().charAt(0);

        System.out.print("Qual seu peso: ");
        peso = sc.nextDouble();

        System.out.print("Qual sua altura: ");
        altura = sc.nextDouble();

        imc = peso / (Math.pow(altura, 2));


        if (sexo == 'm') {
            if (imc < 20.7) {
                System.out.printf("Você está abaixo do peso, seu IMC é %.2f.%n", imc);
            } else if (imc > 20.8 && imc <= 26.4) {
                System.out.printf("Você está no peso ideal, seu IMC é %.2f.%n", imc);
            } else if (imc > 26.5 && imc <= 27.8) {
                System.out.printf("Você está um pouco acima do peso, su IMC é %.2f.%n", imc);
            } else if (imc > 27.9 && imc <= 31.1) {
                System.out.printf("Você está acima do peso, seu IMC é %.2f.%n", imc);
            } else if (imc > 32) {
                System.out.printf("Você está Obeso, seu IMC é %.2f.%n", imc);
            }
        } else if (sexo == 'f') {
            if (imc < 19.1) {
                System.out.printf("Você está abaixo do peso, seu IMC é %.2f.%n", imc);
            } else if (imc >= 19.1 && imc <= 25.8) {
                System.out.printf("Você está no peso ideal, seu IMC é %.2f.%n", imc);
            } else if (imc > 25.9 && imc <= 27.3) {
                System.out.printf("Você está um pouco acima do peso, su IMC é %.2f.%n", imc);
            } else if (imc > 27.4 && imc <= 32.3) {
                System.out.printf("Você está acima do peso, seu IMC é %.2f.%n", imc);
            } else if (imc > 32.3) {
                System.out.printf("Você está Obeso, seu IMC é %.2f.%n", imc);
            }

        }

    }


}
