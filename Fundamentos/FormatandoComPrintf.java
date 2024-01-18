package Fundamentos;

public class FormatandoComPrintf {
    public static void main(String[] args) {

        String nome1 = "Walace";
        int idade = 33;
        double peso = 90.5;

        //%n pula linha
        //%s substitui por string
        //%d substitui por tipo inteiro
        //%f substitui por tipo double e float
        //%9.f substitui por tipo double e float - Controla o tamanho do texto após formatação
        //%.2f substitui por tipo double e float - Controla quantas casas decimais será apresentado

        System.out.printf("Nome: %s, Idade: %d, Peso: %.2fKg.%n", nome1, idade, peso);




    }


}
