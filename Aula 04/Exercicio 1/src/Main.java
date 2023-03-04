public class Main {

    public static void main(String[] args) {

        Zumbi chris = new Zumbi();

        chris.nome = "Zumbi Chris";
        chris.vida = 10;

        System.out.println("Nome do Zumbi: " + chris.nome);
        System.out.println("Vida do Zumbi: " + chris.vida);

        chris.mostraInfo();
    }
}
