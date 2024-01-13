package polimorfismo.dominio.test.questao1;

import polimorfismo.dominio.questao1.*;
import polimorfismo.dominio.questao1.*;

public class Exercicio1Test01 {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Fulano", "Mamifero");
        Peixe peixeEspada = new Peixe("Peixe espada", "Peixe");
        Mamifero gato = new Mamifero("gato1", "Mamifero");
        Peixe sardinha = new Peixe("Sardinha", "Peixe");
        Peixe tubarao = new Peixe("Tubarao", "Peixe");
        Mamifero girafa = new Mamifero("Girafa", "MamIFero");
        Mamifero cavalo = new Mamifero("Cavalo", "mamifero");
        Aves pavao = new Aves("Pavao", "Aves");
        Aves papagaio = new Aves("Papagaio", "Aves");


        Animal[] animalArray = new Animal[]{cachorro, peixeEspada, sardinha, papagaio, girafa, cavalo, gato,  pavao, tubarao};
        Laboratorio laboratorio = new Laboratorio();


        for (Resultado result : test(animalArray, laboratorio)) {
            System.out.println(result.getNomeEspecie());
            System.out.println(result.getQuantidade());
        }
    }




    public static Resultado[] test(Animal[] animal, Ferramentas ferramentas) {
        Animal[] especies = animal;
        String[] especiesEncontrados = ferramentas.classificaEspecie(especies);

        int[] n = new int[especiesEncontrados.length];

        Animal[] retur;
        Resultado[] resultados = new Resultado[especiesEncontrados.length];

        for (int i = 0; i < especiesEncontrados.length; i++) {
            retur = ferramentas.filtraEspecie(especies, especiesEncontrados[i]);
            n[i] = retur.length;
            resultados[i] = new Resultado(retur[0].getNomeEspecie(), n[i]);
        }

        return resultados;

    }


}
