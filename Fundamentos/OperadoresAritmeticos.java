package Fundamentos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int minhaIdade = 40;
        int suaIdade = 25;

        //Adição
        int totalIdades = minhaIdade + suaIdade;
        System.out.println("Soma das Idades: " + totalIdades);

        //Subtração
        int diferencaIdade = minhaIdade - suaIdade;
        System.out.println("Diferença de Idades: " + diferencaIdade);

        //Divisão
        double metadeDaIdade = (double) suaIdade / 2;
        System.out.println("Metade da Idade: " + metadeDaIdade);

        //Multiplicação
        int dobroIdade = 2 * suaIdade;
        System.out.println("Dobro da Idade: " + dobroIdade);

        //Modulo - resto da divisão
            int moduloDivisao = 5 % 2;
        System.out.println("Modulo Divisão: " + moduloDivisao);


    }


}
