package br.inatel.cdg.brownies;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {

        System.out.println("Adicionando no carrinho de compras: " + nome);
    }

    public void calculaValorTotalCompra() {
        System.out.println("O valor total da compra feita (" + nome + ") é: " + preco);
    }

    public void mostraInfo() {
        System.out.println("- Nome do produto: " + nome);
        System.out.println("- Preço do produto: " + preco);
        System.out.println("- Sabor do produto: " + sabor);
        
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}
