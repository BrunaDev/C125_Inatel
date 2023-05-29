package br.inatel.cdg;

public class Usuario
{
    public static String separator = "\n======================//====================\n"; // usado para criar um espaço no prompot para melhor

    private String nome;
    private String email;

    // Usado para armazenar as redes sociais do usuario
    RedeSocial[] redeSocial = new RedeSocial[5]; // 5 para ter um extra das 4 redes sociais

    // Construtor da classe
    public Usuario (RedeSocial[] redeSociais) {

        for (int i = 0; i < redeSocial.length; i++) {

            //Se redeSocial for vazio, entra na ação
            if (redeSocial[i] == null) {
                redeSocial[i] = redeSociais[i];
                break;
            } else {
                System.out.println("Não é mais possível cadastrar. Limite esgotado.");
            }
        }
    }

    //Getters e setters da classe
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
}
