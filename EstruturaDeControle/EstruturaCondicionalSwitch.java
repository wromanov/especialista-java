package EstruturaDeControle;

import java.util.Scanner;

public class EstruturaCondicionalSwitch {
    public static void main(String[] args) {
        //Switch é utilizado quando a tomada de decisão é realizado com base em apensa uma variável

        Scanner sc = new Scanner(System.in);

        String descricaoNota;

        System.out.print("informe a nota de atendimento 1 a 5: ");
        int nota = sc.nextInt();

        switch (nota){
            case 1:
                descricaoNota = "Muito Ruim";
            case 2:
                descricaoNota = "Ruim";
            case 3:
                descricaoNota = "Razoável";
            case 4:
                descricaoNota = "Muito bom";
            case 5:
                descricaoNota = "Excelente";
            default:
                descricaoNota = "Opção Invalida";
        }

        System.out.println(descricaoNota);



    }
}
