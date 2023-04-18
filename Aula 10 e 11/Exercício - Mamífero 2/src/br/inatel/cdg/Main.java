package br.inatel.cdg;

//importando as classes e seus métodos
import br.inatel.cdg.mamiferos.Mamifero;
import br.inatel.cdg.mamiferos.Boi;
import br.inatel.cdg.mamiferos.Cachorro;
import br.inatel.cdg.mamiferos.Lontra;

public class Main {
    public static void main(String[] args) {

        Mamifero boi = new Boi("Bandido", 200);
        Mamifero cachorro = new Cachorro("Thor", 100);
        Mamifero lontra = new Lontra("Alfredo", 150);

        boi.emitirSom();
        cachorro.emitirSom();
        lontra.emitirSom();

        // lontra.nadar();

        boi.mostraInfo();
        cachorro.mostraInfo();
        lontra.mostraInfo();
    }

}
