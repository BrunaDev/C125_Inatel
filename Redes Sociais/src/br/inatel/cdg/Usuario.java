package br.inatel.cdg;

// Importações de classes de pacotes diferentes
import br.inatel.cdg.redes.Facebook;
import br.inatel.cdg.redes.GooglePlus;
import br.inatel.cdg.redes.Instagram;
import br.inatel.cdg.redes.Twitter;

public class Usuario
{
    public static String separator = "\n======================//====================\n"; // usado para criar um espaço no prompot para melhor

    private String nome;
    private String email;

    RedeSocial[] redeSocial = new RedeSocial[5]; // 5 para ter um extra das 4 redes sociais

    // Construtor da classe
    public void Usuario (RedeSocial redeSociais) {

        for (int i = 0; i < redeSocial.length; i++) {

            //inserindo o array
            if (redeSocial[i] == null) {
                redeSocial[i] = redeSociais;

                //vericando de qual classe pertence o tipo rede social
                if (redeSocial[i] instanceof Facebook)
                {
                    System.out.println("O usuário foi cadastrado no Facebook!");
                    break;
                }
                else if (redeSocial[i] instanceof Instagram)
                {
                    System.out.println("O usuário foi cadastrado no Instagram!");
                    break;
                }
                else if (redeSocial[i] instanceof GooglePlus)
                {
                    System.out.println("O usuário foi cadastrado no GooglePlus!");
                    break;
                }
                else if (redeSocial[i] instanceof Twitter)
                {
                    System.out.println("O usuário foi cadastrado no Twitter!");
                    break;
                }

                break;
            }
        }
    }


    //Getters e setters da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
