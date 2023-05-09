package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Anakin", 123456789);
        Cliente cliente2 = new Cliente("Padmé", 987654321);
        // Atribuindo null ao cliente3 para criar um erro
        Cliente cliente3 = null;

        Conta conta = new Conta(1500, 500);

        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();

        System.out.println("Fim da Main");
    }
}
