package br.inatel.cdg.mamiferos;

public class Boi extends Mamifero {

    // boi é subclasse de Mamifero (superclasse)
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuuuu - o boi " + nome + " está emitindo som!");
    }
}
