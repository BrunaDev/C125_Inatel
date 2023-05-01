package br.inatel.cdg.classes;

// Problema 1: tem que ser uma classe abstrata
public abstract class ClasseMae implements Comparable<ClasseMae> {

    protected String nome;
    protected int idade;

    // Problema 2: tenho que adicionar um contrutor com os dois parametros da classe

    @Override
    public int compareTo(ClasseMae o) {
        return Integer.compare(o.getIdade(), this.idade);
    }

    public ClasseMae(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
