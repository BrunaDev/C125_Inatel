package br.inatel.cdg.mamiferos;

public class Cachorro extends Mamifero {

    // cachorro é subclasse de Mamifero (superclasse)
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auauau - o cachorro " + nome + " está emitindo som!");
    }

}
