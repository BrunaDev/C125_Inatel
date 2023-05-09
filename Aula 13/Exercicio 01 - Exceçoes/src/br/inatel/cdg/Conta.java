package br.inatel.cdg;

import java.util.Set;
import java.util.HashSet;

public class Conta {

    // Criando variáveis da classe
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    // Construtor da Classe
    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // Método para adicionar cliente
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Nao existe cliente nessa posicao");
            }
        }
    }
}
