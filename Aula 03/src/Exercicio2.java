import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // entrada dinamica
        System.out.println("Entre com o número de lanches consumidos na primeira hora: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Entre com o número de lanches consumidos na segunda hora: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Entre com o número de lanches consumidos na terceira hora: ");
        int lanche3 = entrada.nextInt();

        /*
         * outro método
         * int lanche1, lanche2, lanche3;
         * 
         * System.out.println("Entre com as qtt dos laches em ordem:");
         * lanche1 = entrada.nextInt();
         * lanche2 = entrada.nextInt();
         * ...
         */

        int soma = lanche1 + lanche2 + lanche3;

        System.out.println("O total de lanches: " + soma);

        int media = soma / 3;

        System.out.println("A media de lanches: " + media);

        entrada.close();
    }
}
