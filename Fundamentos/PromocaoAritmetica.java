package Fundamentos;

public class PromocaoAritmetica {
    public static void main(String[] args) {
        int x = 10;
        long y = 6;
        double c = 6.7;

        long result1 = x * y;
        double result2 = c * y;
        double result3 = c / y; // Divisão decimal
        float result4 = x / y; // Divisão inteira porque as duas variáveis são inteiras.
        float result5 = (float) (x / y); // Para resolver precisamos que uma das variáveis seja do tipo float ou double, ou fazer um casting explicito.


        //Quando realizamos um cálculo com um tipo menor e o outro maior, o resultado sempre será do tipo maior.
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);






    }

}
