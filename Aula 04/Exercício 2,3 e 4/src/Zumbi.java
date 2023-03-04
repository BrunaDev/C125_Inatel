//Exercicio 2, 3 e 4 do slide 04

public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {

        System.out.println("A vida do Zumbi e: " + vida);
        return 0;
    }

    boolean transfereVida(Zumbi zumbialvo, double quantia) {

        if (vida >= quantia) {
            zumbialvo.vida -= quantia;
            return true;
        } else {
            System.out.println("Não foi possivel transferir vida!");
            return false;
        }
    }
}
