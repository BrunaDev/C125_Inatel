package br.inatel.cdg;
// Importações de classes de pacotes diferentes
import br.inatel.cdg.redes.Facebook;
import br.inatel.cdg.redes.GooglePlus;
import br.inatel.cdg.redes.Instagram;
import br.inatel.cdg.redes.Twitter;
// Importação do Java
import java.util.Scanner;
//Importação de exceções
import br.inatel.cdg.exception.ErroRedesSociais;

 public class Main {

    public static String separator = "\n======================//====================\n"; // usado para criar um espaço no prompot para melhor visualização de itens

    public static void main(String[] args)  throws ErroRedesSociais{

        RedeSocial[] redeSocial = new RedeSocial[5];

        //Criando o usuário
        Usuario usuario = new Usuario(redeSocial);
        usuario.setNome("Anakin");
        usuario.setEmail("anakin&padmeforever@gmail.com");

        System.out.println(separator);

        //Informando o nome de usuario e seu e-mail
        System.out.println("Nome: " + usuario.getNome() + "\nE-mail: " + usuario.getEmail());
        System.out.println(separator);

        Scanner entrada = new Scanner(System.in);

        //Criando redes sociais
        for (int i = 0; i < redeSocial.length; i++) {

            int valor = 6;

            System.out.println("Qual rede deseja acessar? - Entradas já programadas (senha e seguidores)");

            do {
                System.out.println("1 - Facebook\n2 - Instagram\n3 - Google Plus\n4 - Twitter\n0 - Sair");
                valor = entrada.nextInt();
                entrada.nextLine();

                if (!(valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 0)) {
                    System.out.println("Opção inválida. Digite novamente.");
                }
            
            } while(!(valor == 1 || valor == 2 || valor == 3 || valor == 4 || valor == 0));
            //Se os valores forem diferentes desses do while, volta para pergunta novamente.

            //Se valor for igual a zero, interrompe o bloco de código
            if(valor == 0) break;

            //Verificação dos valores
            switch (valor) {
                case 1:  //facebook
                    Facebook facebook = new Facebook("123", 2500);
                    // Array de redeSociais na Classe Usuario recebe a rede social Facebook
                    
                    usuario.redeSocial[i] = facebook;
                    break;
                
                case 2: //instagram
                    Instagram instagram = new Instagram("753", 985);
                    // Array de redeSociais na Classe Usuario recebe a rede social Instagram
                    usuario.redeSocial[i] = instagram;
                    break;

                case 3: //google plus
                    GooglePlus googleplus = new GooglePlus("456", 10);
                    // Array de redeSociais na Classe Usuario recebe a rede social GooglePlus
                    usuario.redeSocial[i] = googleplus;
                    break;

                case 4: //twitter
                    Twitter twitter = new Twitter("789", 120);
                    // Array de redeSociais na Classe Usuario recebe a rede social Twitter
                    usuario.redeSocial[i] = twitter;
                    break;

                default:
                    break;
            }
        }

        //Função para adicionar a separação/quebra de linha
        System.out.println(separator);

        //Tratamento de dados
        for (int j = 0; j < usuario.redeSocial.length; j++) {
            if (usuario.redeSocial[j] != null) {
                    //O operador instanceof é usado para verificar se um objeto é uma instância de uma determinada classe, uma instância de uma subclasse ou uma instância de uma classe que implementa uma determinada interface
                    if (usuario.redeSocial[j] instanceof Facebook)
                    {
                        System.out.println("\nFacebook:");
                        usuario.redeSocial[j].postarComentario();
                        usuario.redeSocial[j].postarFoto();
                        usuario.redeSocial[j].postarVideo();
                        System.out.println(separator);
                    }

                    else if (usuario.redeSocial[j] instanceof GooglePlus)
                    {   
                        System.out.println("\nGoogle Plus:");
                        ((GooglePlus) usuario.redeSocial[j]).fazStreaming();
                        ((GooglePlus) usuario.redeSocial[j]).compartilhar();
                        usuario.redeSocial[j].curtirPublicacao();
                        System.out.println(separator);
                    }

                    else if (usuario.redeSocial[j] instanceof Twitter)
                    {
                        System.out.println("\nTwitter:");
                        usuario.redeSocial[j].curtirPublicacao();
                        usuario.redeSocial[j].postarFoto();
                        ((Twitter) usuario.redeSocial[j]).compartilhar();
                        System.out.println(separator);
                    }

                    else if (usuario.redeSocial[j] instanceof Instagram)
                    {
                        System.out.println("\nInstragram:");
                        usuario.redeSocial[j].postarFoto();
                        usuario.redeSocial[j].postarVideo();
                        usuario.redeSocial[j].curtirPublicacao();
                        System.out.println(separator);
                    }
                    else {
                        throw new ErroRedesSociais("Erro ao tratar dados das redes sociais");
                    }
                }
        }
    }
} 
