package br.inatel.cdg;

public class Contador2 implements Runnable{
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Valor do contador: " + i + " - Contador 2!");
        }
    }
}