package br.inatel.cdg;

import br.inatel.cdg.comprador.Comprador;
import br.inatel.cdg.brownies.BrownieCafe;
import br.inatel.cdg.brownies.BrownieDoceDeLeite;
import br.inatel.cdg.brownies.BrownieNutella;

public class Main {

    public static void main(String[] args) {

        BrownieCafe bc = new BrownieCafe("Brownie de Café", 10, "Café");
        BrownieDoceDeLeite dc = new BrownieDoceDeLeite("Brownie de Doce de Leite", 12.5, "Doce de Leite CooperRita");
        BrownieNutella bn = new BrownieNutella("Brownie Nutella", 15, "Nutella - Creme de Avelã");

        Comprador comprador = new Comprador("Comprador", 1000.95);

        comprador.efetuarCompra(bc);
        comprador.efetuarCompra(bn);
        comprador.efetuarCompra(dc);

    }
}
