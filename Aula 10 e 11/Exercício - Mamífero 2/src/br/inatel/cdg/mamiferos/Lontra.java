package br.inatel.cdg.mamiferos;

import br.inatel.cdg.interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("A lontra " + nome + " está emitindo som!");
    }

    @Override
    public void nadar() {
        System.out.println("A lontra " + nome + " está nadando!");
    }
}
