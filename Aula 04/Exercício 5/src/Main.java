public class Main {
    public static void main(String[] args) throws Exception {

        Personagem chris = new Personagem();
        Arma espada = new Arma();

        chris.nome = "Chris";
        chris.pontos = 100;
        espada.resistencia = 999;

        chris.arma = espada;

        chris.tomarDano();
        chris.usarArma();

        espada.mostraInfoArma();
    }
}
