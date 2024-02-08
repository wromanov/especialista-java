package Poo;

public class Principal {
    public static void main(String[] args) {

        //Estanciando uma classe / Objeto

        Pessoa eu = new Pessoa();
        Pessoa voce = new Pessoa();

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        //Acessando variáveis de um objeto estanciado
        meuCarro.proprietario = eu;
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "HRV";
        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2020;

        seuCarro.proprietario = voce;
        seuCarro.cor = "Azul";
        seuCarro.modelo = "ONIX";
        seuCarro.fabricante = "Chevrolet";
        seuCarro.anoFabricacao = 2024;

        System.out.println("--Meu Carro--");
        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Cor: %s%n", meuCarro.cor);
        System.out.printf("Ano: %d%n%n", meuCarro.anoFabricacao);

        System.out.println("--Seu Carro--");
        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Cor: %s%n", seuCarro.cor);
        System.out.printf("Ano: %d", seuCarro.anoFabricacao);

    }
}
