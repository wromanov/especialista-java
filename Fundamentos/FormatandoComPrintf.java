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

        System.out.printf("Nome: %s, Idade: %d, Peso: %.2fKg.%n", nome1, idade, peso);




    }


}
