package br.inatel.cdg;

// Importando bibliotecas
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Importando classes
import br.inatel.cdg.classes.ClasseMae;
import br.inatel.cdg.classes.ClasseFilha1;
import br.inatel.cdg.classes.ClasseFilha2;
import br.inatel.cdg.classes.ClasseFilha3;

public class Main {
    public static void main(String[] args) {

        List<ClasseMae> listaClasseMae = new ArrayList<ClasseMae>();

        ClasseFilha1 anakin = new ClasseFilha1("Anakin", 19);
        ClasseFilha2 padme = new ClasseFilha2("Padmé", 24);
        ClasseFilha3 joaquim = new ClasseFilha3("Joaquim", 7);

        listaClasseMae.add(anakin);
        listaClasseMae.add(padme);
        listaClasseMae.add(joaquim);

        // Ordena chamando o método sort (static)
        Collections.sort(listaClasseMae);

        // Depois de ordenar
        System.out.println("Apresentação em ordem decrescente: ");
        for (ClasseMae filhas : listaClasseMae) {
            System.out.println(filhas.getNome() + " - " + filhas.getIdade() + " anos.");
        }

    }
}
