public class Main {
    public static void main(String[] args) throws Exception {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel"; // define o nome da cantina

        Salgado salgado1 = new Salgado(); // cria um novo salgado
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        // define o nome dos salgados
        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfirra";
        salgado3.nome = "Kibe";

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);

        cantina.mostraInfo();
    }
}
