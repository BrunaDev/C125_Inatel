//Exercicio 2, 3 e 4 do slide 04

public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {

        System.out.println("A vida do Zumbi e: " + vida);
        return 0;
    }

    boolean transfereVida(Zumbi zumbialvo, double quantia) {

        // Faz a verificação em relação da vida do zumbi e a quantia que ele perde
        if (vida >= quantia) {

            vida -= quantia; // remove da vida de um zumbi
            zumbialvo.vida += quantia; // adiciona na vida de outro zumbi

            return true; // se a vida foi transferida, retorna "true"
        } else {

            System.out.println("Não foi possivel transferir vida!");

            return false; // se a vida foi transferida, retorna "false"
        }
    }
}
