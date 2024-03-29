package EstruturaDeControle;

import java.util.Scanner;

public class ArrowLabelSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um dia da semana: ");
        String diaSemana = sc.nextLine();
        String horarioFuncionamento;

        //Utilizando Arrow Label não precisa mais utilizar a claúsula break.

        switch (diaSemana) {
            case "seg" -> horarioFuncionamento = "Fechado";
            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08h as 18h";
            case "sab", "dom" -> horarioFuncionamento = "08h as 12h";
            default -> horarioFuncionamento = "Dia inválido";
        }
        //System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);

        //Switch Expression a partir do java 14
        String horarioFuncionamento2 = switch (diaSemana) {
            case "seg" -> "Fechado";
            case "ter", "qua", "qui", "sex" -> "08h as 18h";
            case "sab", "dom" -> "08h as 12h";
            default -> "Dia inválido";
        };

        System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento2);
    }
}
