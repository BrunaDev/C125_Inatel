public class Personagem {

    String nome;
    int pontos;
    // Declarando a Classe Arma na Classe Personagem
    Arma arma; // uma agregação

    void usarArma() {
        arma.resistencia -= 2;
    }

    void tomarDano() {
        pontos -= 5;
    }

}
