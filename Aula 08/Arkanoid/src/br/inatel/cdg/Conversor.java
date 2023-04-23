package br.inatel.cdg;

public class Conversor {

    public static void converter(int pontos) {
        System.out.println("Pontuação do jogador: " + pontos);
        System.out.println("Moedas adquiridas: " + (pontos * 100));
    }
}
