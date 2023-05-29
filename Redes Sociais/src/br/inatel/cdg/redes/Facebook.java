//definindo o caminho dos pacotes
package br.inatel.cdg.redes;

//importando arquivos de pacotes diferentes
import br.inatel.cdg.RedeSocial;
import br.inatel.cdg.interfaces.Compartilhamento;
import br.inatel.cdg.interfaces.VideoConferencia;

//Classe Facebook herda de Rede Social
public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    //Construtor da classe
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //Reescritas dos métodos
    @Override
    public void fazStreaming() {
        System.out.println("Você está fazendo um Streaming no Facebook\n");

    }

    @Override
    public void compartilhar() {
        System.out.println("Você compartilhou algo no seu Facebook\n");

    }

    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Facebook\n");

    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um vídeo no Facebook\n");

    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentário no Facebook\n");

    }
}
