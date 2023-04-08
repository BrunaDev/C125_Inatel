package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide; //Importa a classe asteroide e seus métodos para a classe nave

public class Nave {

    // Private: é um modificador de acesso que restringe totalmente o acesso aquele
    // recurso da classe de todas as demais classes, sejam elas do mesmo pacote, de
    // outros pacotes ou até subclasses.
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast) {
        if (tipoTiro == "Explosivo") {
            // o tipo de tiro explosivo destroi qualquer asteroide
            ast.destruir();
        } else if (ast.getTipoAString() == "Grande") {
            System.out.println("Não será possível destruir o asteroide, é muito grande para o tiro normal da " + nome);
        } else {
            ast.destruir(); // restando apenas o asteroide pequeno qualquer tipo destroi
        }
    }
}
