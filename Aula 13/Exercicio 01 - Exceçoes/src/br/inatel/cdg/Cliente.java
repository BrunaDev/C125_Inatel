package br.inatel.cdg;

public class Cliente {

    // Variáveis da Classe
    private String nome;
    private long cpf;

    // Construtor da classe
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Get's
    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }
}
