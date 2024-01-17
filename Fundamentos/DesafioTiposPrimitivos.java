package Fundamentos;

public class DesafioTiposPrimitivos {
    static int calcularPeso(double peso1, double peso2) {
        int pesoTotal = (int) (peso1 + peso2);
        return pesoTotal;

    }

    public static void main(String[] args) {

        double pesoCarga1 = 1033.49;
        double pesoCarga2 = 849.88;

        System.out.println("Peso total da carga: " + calcularPeso(pesoCarga1, pesoCarga2) + " Kg.");


    }


}
