package Fundamentos;

public class TrabalhandoComString {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        String nome = "Maria"; //String em java é uma classe, apesar de ser nativo.

        //O compilador verifica que tem um texto e um sinal de "+" logo após o texto, assim ele entende que deve concatenar.
        System.out.println("Fala, mergulhador " + num1 + num2);

        //Assim primeiro realizamos o calculo de depois o resultado é concatenado.
        System.out.println("Fala, mergulhador " + (num1 + num2));

        System.out.println(nome + " tem " + num1 + " anos.");


    }


}
