package Fundamentos;

public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {

        //Casting de tipos primitivos em Java

        long x = 10;

        //Fazendo casting, convertendo uma variável do tipo long para tipo int, e em sequencia atribuindo a uma varivel do tipo int.
        int y = (int) x;

        long b = 91234567899L;

        //Fazendo casting e perdendo dados, pois o long não cabe dentro do int.

        int d = (int) b;

        System.out.println("Casting long para int, sem perder dados: " + b);
        System.out.println("Casting long para int, perdendo dados: " + d);

        //Casting automático quando um tipo menor será atribuído a tipo maior.

        float a = 35.0f;

        //double i = (double) a; //Instrução de casting é opcional
        double i = a;

        System.out.println(i);






    }





}
