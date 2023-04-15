package br.inatel.cdg.brownies;

public class BrownieCafe extends Brownie {

    // Constructor
    public BrownieCafe(String nome, double preco, String sabor) {

        super(nome, preco, sabor);

    }

    public void adicionaCafe() {
        System.out.println(super.nome + "Opção selecionada: adicionando mais café.");
    }
}
