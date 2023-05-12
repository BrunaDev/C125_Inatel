package br.inatel.cdg;

import br.inatel.cdg.exception.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Anakin", 123456789);
        // Cliente cliente2 = new Cliente("Padmé", 987654321);

        Conta conta = new Conta(1500, 500);

        conta.addCliente(cliente1);
        // conta.addCliente(cliente2);

        // Mostrando informações iniciais do cliente
        System.out.println("Mostrando informações do cliente: ");
        System.out.println(); // para ganhar "espaço" na saída do prompot
        conta.mostraInfo();
        System.out.println("----- x -----"); // separando info na saída do prompot

        // Chamando o método de sacar() + tratamento de erro try-catch
        System.out.println("Tentando sacar 1200: ");
        System.out.println(); // para ganhar "espaço" na saída do prompot
        try {
            conta.sacar(1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); // ".getMessage" já vem definida em throws
        }
        System.out.println();

        // Mostrando informações depois do primeiro saque do clientes
        System.out.println("Mostrando informações do cliente após o primeiro saque: ");
        System.out.println(); // para ganhar "espaço" na saída do prompot
        conta.mostraInfo();
        System.out.println("----- x -----"); // separando info na saída do prompot

        // Chamando o método de sacar() + tratamento de erro try-catch
        System.out.println("Tentando sacar mais 1000: ");
        System.out.println(); // para ganhar "espaço" na saída do prompot
        try {
            conta.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); // ".getMessage" imprime a mensagem de erro
        }
        System.out.println("----- x -----"); // separando info na saída do prompot

        // Mostrando informações finais do cliente
        System.out.println("Mostrando informações do cliente após saques: ");
        System.out.println(); // para ganhar "espaço" na saída do prompot
        conta.mostraInfo();

        System.out.println("Fim da Main");
    }
}
