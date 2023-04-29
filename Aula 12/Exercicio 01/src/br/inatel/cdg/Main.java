package br.inatel.cdg;

//Importações de bibliotecas
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Double> listaDouble = new ArrayList<>();

        // Criando números quaisquer usando o for para limitar a quantidade
        for (int i = 0; i < 5; i++) {
            listaDouble.add(new Random().nextDouble() * 100); // atribuição direta de números aleatórios
        }

        System.out.println("Antes da ordenação: ");
        for (Double double1 : listaDouble) {
            System.out.println(double1);
        }

        // O sort ordena em ordem crescente e o reverseOrdem o coloca em ordem
        // decrescente
        Collections.sort(listaDouble, Collections.reverseOrder(null)); // funciona apenas para tipos primitivos

        System.out.println("Depois da ordenação: ");
        for (Double double1 : listaDouble) {
            System.out.println(double1);
        }
    }
}
