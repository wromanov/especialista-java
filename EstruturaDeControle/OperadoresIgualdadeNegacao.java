package EstruturaDeControle;

public class OperadoresIgualdadeNegacao {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 11;

        //boolean numerosIguais = 10 == 10;

        //boolean numerosIguais = (4 + 6) == (5 * 2);

        //Operador de Igualdade
        boolean numerosIguais = number1 == number2;

        //Negação, se for verdadeiro se torna falso, e vice-versa.

        //Operador de Negação
        //boolean numerosSaoDiferetes = !numerosIguais;

        //boolean numerosSaoDiferetes = !(number1 == number2);

        //Operador de Diferença
        boolean numerosSaoDiferetes = number1 != number2;

        System.out.printf("Números São Iguais: %b\n", numerosIguais);

        //System.out.printf("Números iguais: %b\n", number1 == number2);

        System.out.printf("Números São Diferentes: %b\n", numerosSaoDiferetes);



    }
}
