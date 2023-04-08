package br.inatel.cdg.inimigo;

public class Asteroide {

    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome; // O "this." é usado para referenciar a um atributo externo, fora do método.
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir() {
        System.out.println("O asteroide " + tipoAsteroide + " - " + nome + " - será destruido!");
    }

    // Método GET: utilizado sempre que acessar/pegar alguns atributos da
    // classe.Esse método sempre retornará um valor idenpendente de seu tipo.
    public String getTipoAString() {
        return this.tipoAsteroide;
    }
}
