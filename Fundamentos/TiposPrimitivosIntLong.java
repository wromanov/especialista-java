package Fundamentos;

public class TiposPrimitivosIntLong {
    public static void main(String[] args) {
        int menorValorInt = -2_147_483_648;
        int maiorValorInt = 2_147_483_647;

    /*Todo literal digitado diretamente no código fonte é tratado como inteiro, dessa forma
        precisamos usar o "L" após o valor para informar que trata-se de um tipo "Long"*/

        long menorValorLong = -9_223_372_036_854_775_808L;
        long maiorValorLong = 9_223_372_036_854_775_807L;

        //System.out.println(2_147_483_648); //Não compila
        System.out.println(2_147_483_648L); //Usamos um L para indicar que é um tipo long.

    }










}
