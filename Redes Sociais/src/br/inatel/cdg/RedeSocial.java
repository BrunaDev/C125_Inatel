package br.inatel.cdg;

// A Classe RedeSocial é abstrata
public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    // Métodos abstratos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Você curtiu a publicação!\n");
    }

    // Liberando o acesso para a visualização (GET)
    public int getNumAmigos() {
        return this.numAmigos;
    }

    // Liberando o acesso para a edição (SET)
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
}