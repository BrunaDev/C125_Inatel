package br.inatel.cdg;

// A Classe RedeSocial é abstrata
public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    //Construtor da classe
    public RedeSocial(String senha, int numAmigos)
    {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    // Métodos abstratos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Você curtiu a publicação!\n");
    }
}
