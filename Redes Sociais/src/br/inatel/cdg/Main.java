package br.inatel.cdg;

// Importações de classes de pacotes diferentes
import br.inatel.cdg.redes.Facebook;
import br.inatel.cdg.redes.GooglePlus;
import br.inatel.cdg.redes.Instagram;
import br.inatel.cdg.redes.Twitter;
import br.inatel.cdg.exception.ErroRedesSociais;


 public class Main {

    public static String separator = "\n======================//====================\n"; // usado para criar um espaço no prompot para melhor
                                                                                         // visualização de itens

    public static void main(String[] args)  throws ErroRedesSociais{

        //Criando o usuário
        Usuario usuario = new Usuario();
        usuario.setNome("Anakin");
        usuario.setEmail("anakin&padmeforever@gmail.com");

        //Criando redes sociais
        Facebook facebook = new Facebook();
        facebook.senha = "123";
        facebook.numAmigos = 1000;

        GooglePlus googleplus = new GooglePlus();
        googleplus.senha = "456";
        googleplus.numAmigos = 10;

        Twitter twitter = new Twitter();
        twitter.senha = "789";
        twitter.numAmigos = 900;

        Instagram instagram = new Instagram();
        instagram.senha = "753";
        instagram.numAmigos = 1200;

        //Setando o usuário cadastrado como o usuário das redes sociais
        usuario.Usuario(facebook);
        usuario.Usuario(googleplus);
        usuario.Usuario(twitter);
        usuario.Usuario(instagram);

        //Função para adicionar a separação/quebra de linha
        System.out.println(separator);

        //Tratamento de dados
        for (int i = 0; i < usuario.redeSocial.length; i++) {
            if (usuario.redeSocial[i] != null) {
                    //O operador instanceof é usado para verificar se um objeto é uma instância de uma determinada classe, uma instância de uma subclasse ou uma instância de uma classe que implementa uma determinada interface
                    if (usuario.redeSocial[i] instanceof Facebook)
                    {
                       //Casting de facebook
                        Facebook auxfb = (Facebook) usuario.redeSocial[i];
                        auxfb.compartilhar();
                        auxfb.postarFoto();
                        auxfb.fazStreaming();
                        System.out.println(separator);
                    }

                    else if (usuario.redeSocial[i] instanceof GooglePlus)
                    {
                       //Casting de google plus
                        GooglePlus auxgp = (GooglePlus) usuario.redeSocial[i];
                        auxgp.compartilhar();
                        auxgp.fazStreaming();
                        auxgp.curtirPublicacao();
                        System.out.println(separator);
                    }

                    else if (usuario.redeSocial[i] instanceof Twitter)
                    {
                        //Casting de twitter
                        Twitter auxtt = (Twitter) usuario.redeSocial[i];
                        auxtt.compartilhar();
                        auxtt.curtirPublicacao();
                        auxtt.postarComentario();
                        System.out.println(separator);
                    }

                    else if (usuario.redeSocial[i] instanceof Instagram)
                    {
                        //Casting de instagram
                        Instagram auxinsta = (Instagram) usuario.redeSocial[i];
                        auxinsta.postarComentario();
                        auxinsta.postarVideo();
                        auxinsta.postarFoto();
                        System.out.println(separator);
                    }
                    else {
                        throw new ErroRedesSociais("Erro ao tratar dados das redes sociais");
                    }
            }
        }
    }
} 
