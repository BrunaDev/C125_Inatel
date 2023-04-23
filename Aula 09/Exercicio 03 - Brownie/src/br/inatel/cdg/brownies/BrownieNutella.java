package br.inatel.cdg.brownies;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {

        System.out.println(super.nome + " Opção selecionada: adicionando mais nutella.");
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de nutella sendo adicionado");
    }
}
