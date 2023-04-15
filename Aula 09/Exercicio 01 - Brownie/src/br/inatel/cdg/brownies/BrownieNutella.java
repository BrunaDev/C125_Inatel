package br.inatel.cdg.brownies;

public class BrownieNutella extends Brownie {

    // Constructor
    public BrownieNutella(String nome, double preco, String sabor) {

        super(nome, preco, sabor);

    }

    public void adicionaNutella() {

        System.out.println(super.nome + "Opção selecionada: adicionando mais nutella.");
    }
}
