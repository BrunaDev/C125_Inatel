package br.inatel.cdg;

// Importações de classes e seus métodos
import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        // Criando as naves
        Nave nave1 = new Nave("Millennium_Falcon", 100, "Normal");
        Nave nave2 = new Nave("Estrela_da_Morte", 500, "Explosivo");

        // Criando os asteroides
        Asteroide ast1 = new Asteroide("Ceres", "Grande");
        Asteroide ast2 = new Asteroide("Higia", "Normal");

        // Millennium Falcon atirando em ambos os asteroides
        System.out.println("Millennium Falcon em ação!");
        nave1.atirar(ast2);
        nave1.atirar(ast1);

        System.out.println("    "); // espaço em branco para separar as informações da saída

        // Estrela da Morte atirando em ambos os asteroides
        System.out.println("Estrela da morte em ação!");
        nave2.atirar(ast2);
        nave2.atirar(ast1);
    }
}