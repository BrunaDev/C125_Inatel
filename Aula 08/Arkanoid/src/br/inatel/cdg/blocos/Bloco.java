package br.inatel.cdg.blocos;

public class Bloco {

    private static int numBlocos = 0;

    public Bloco() {
        numBlocos++;
    }

    public void destruir() {
        System.out.println("Bloco sendo destruido.");
        numBlocos--;
    }

    // Get
    public static int getNumBlocos() {
        return numBlocos;
    }
}
