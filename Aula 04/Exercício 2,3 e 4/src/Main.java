public class Main {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 100;

        z1.mostraVida();
        z2.mostraVida();

        // z1 = z2; // com isso, o valor das 2 instancias passa ser o mesmo, ou seja, se
        // mudar a de
        // uma muda a de outra

        z1.mostraVida();
        z2.mostraVida();

        z1.transfereVida(z2, 50);

        System.out.println("A vida do zumbi 1 é: " + z1.vida);
        System.out.println("A vida do zumbi 2 é: " + z2.vida);

    }
}
