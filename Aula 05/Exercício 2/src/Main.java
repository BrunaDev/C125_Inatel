import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Uma matriz que gera o campo minado 10:10
        boolean campoMinado[][] = new boolean[10][10];

        Random rand = new Random();
        // Para ler do teclado a posição digitada
        Scanner entrada = new Scanner(System.in);

        int posicaoMinaX = rand.nextInt(10);
        int posicaoMinaY = rand.nextInt(10);
        System.out.println("Bomba: " + posicaoMinaX + " - " + posicaoMinaY);

        campoMinado[posicaoMinaX][posicaoMinaY] = true;

        int posicaoJogadorX, posicaoJogadorY;

        System.out.println("Bem vindo! Este é o campo minado.");

        // Uma possivel solução utilizando o for
        for (int i = 0; i < campoMinado.length * 2; i++) {
            System.out.println("Digite uma posicao X: ");
            // Gera um número aleatório entre 0 e 1
            posicaoJogadorX = entrada.nextInt();
            System.out.println("Digite uma posicao Y: ");
            // Gera um número aleatório entre 0 e 1
            posicaoJogadorY = entrada.nextInt();

            if (campoMinado[posicaoJogadorX][posicaoJogadorY]) {
                System.out.println("EXPLODIU!");
            } else {
                System.out.println("SAFE!");
            }
        }

        System.out.println("Jogo Encerrado");
        entrada.close();
    }
}

// Uma possivel solução utilizando o do - while
// int contador = 0;
// do {
// System.out.print("Digite uma posicao X: ");
// posicaoXJogador = entrada.nextInt();
//
// System.out.print("Digite uma posicao Y: ");
// posicaoYJogador = entrada.nextInt();
//
// if(campoMinado[posicaoXJogador][posicaoYJogador]){
// System.out.println("Opa acertou a mina");
// contador = 0;
// }else{
// System.out.println("Boa! Sem mina");
// contador++;
// }
//
//
// } while (contador < 3);