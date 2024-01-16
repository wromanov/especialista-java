package Fundamentos;

public class TiposPrimitivosDoubleFloat {
    public static void main(String[] args) {

        /* Quando digitamos um valor literal com casa decimal no código Java,
        * o Java já entende automaticamente que se trata de um valor do tipo Double */

        double peso = 84.9d; //"d" é opcional

        System.out.println(peso);

        /*Utiliza-se o "F" após digitamos um valor float, pois o java entende que
        * todo valor literal digitado é um double, por isso precisamos indicar,
        *  que o valor trata-se de um float, para que o compilador não reclame
        * de perda de dados e não deixe o código compilar.*/

        //Casting explicito
        float taxa = (float) 1_294.93;

        //Indicando que o valor é um float
        float media = 1_294.93f;
        System.out.println(taxa);
        System.out.println(media);













    }


}
