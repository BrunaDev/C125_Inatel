package br.inatel.cdg.jogador;

import br.inatel.cdg.blocos.Bloco;

public class Jogador {

    private int ponto;

    public void destruirBloco(Bloco bloco) {
        bloco.destruir();
        ponto++;
    }

    public int getPonto() {
        return this.ponto;
    }
}
