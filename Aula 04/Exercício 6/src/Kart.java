public class Kart {

    String nome;
    Motor motor; // agregação
    Piloto piloto; // composição

    public Kart() { // constructor - composição
        motor = new Motor();
    }

    void pular() {
        System.out.println("O carro " + nome + " esta pulando.");
    }

    void soltarTurbo() {
        System.out.println("O carro " + nome + " soltando o turbo.");
    }

    void fazerDrift() {
        System.out.println("O carro " + nome + " esta fazendo drift.");
    }
}
