package Fundamentos;

public class AbreviacaoOperadoresAritmeticos {

    public static void main(String[] args) {

        int quantidadeProdutos = 10;

        //Adicionando mais produtos

        quantidadeProdutos = quantidadeProdutos + 1;
        quantidadeProdutos = quantidadeProdutos - 1;
        quantidadeProdutos = quantidadeProdutos / 2;
        quantidadeProdutos = quantidadeProdutos * 2;

        //Ou

        quantidadeProdutos += 1;
        quantidadeProdutos -= 1;
        quantidadeProdutos *= 2;
        quantidadeProdutos /= 2;
        quantidadeProdutos %= 2;

        System.out.println(quantidadeProdutos);






    }

}
