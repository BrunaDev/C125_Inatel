import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int npa, np3;

        // entrada dinamica
        System.out.println("Entre com a sua nota da NP1: ");
        int np1 = entrada.nextInt();
        System.out.println("Entre com a sua nota da NP2: ");
        int np2 = entrada.nextInt();

        npa = (np1 + np2) / 2;

        if (npa >= 60) {
            System.out.println("Parabéns, você passou!");
        } else if (npa >= 30 && npa < 60) {
            System.out.println("Você não passou, mas calma, tem NP3 ainda!");
            np3 = 100 - npa;
            System.out.println("Você precisa tirar " + np3 + " pts na NP3!");
        } else {
            System.out.println("Você não passou!");
        }

        entrada.close();
    }
}