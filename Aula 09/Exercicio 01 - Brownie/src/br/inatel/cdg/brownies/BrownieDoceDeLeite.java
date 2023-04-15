package br.inatel.cdg.brownies;

public class BrownieDoceDeLeite extends Brownie {

    // Constructor
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {

        super(nome, preco, sabor);

    }

    public void adicionaDoceDeLeite() {
        System.out.println(super.nome + "Opção selecionada: adicionando mais doce de leite.");
    }
}
