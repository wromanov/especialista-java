package Fundamentos;

public class TiposPrimitivosBoolean {

    public static void main(String[] args) {

        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.print(compraAprovada);
        System.out.print(clienteBloqueado);

        int quantidadeEstoque = 10;
        int quantidadePedidoCompra = 15;

        boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;

        System.out.println("Estoque Suficiente: " + estoqueSuficiente);




    }


}
