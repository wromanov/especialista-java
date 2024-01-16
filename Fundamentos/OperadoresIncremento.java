package Fundamentos;

public class OperadoresIncremento {
    public static void main(String[] args) {
        int totalDownloads = 0;
        int novoTotalDownloads = 0;

        //totalDownloads = totalDownloads + 1;
        //totalDownloads += 1;

        //incremento pré-fixado, incrementa e depois atribui.
        novoTotalDownloads = ++totalDownloads;

        //incremento pós-fixado, atribui o valor a variável e depois incrementa.
        novoTotalDownloads = totalDownloads++;


        System.out.println("Total de Downloads: " + totalDownloads);
        System.out.println("Total de NovoDownloads: " + novoTotalDownloads);


    }
}
