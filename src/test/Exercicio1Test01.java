package test;

import dominio.*;

public class Exercicio1Test01 {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Fulano", "Mamifero");
        Peixe peixe = new Peixe("Peixe espada", "Peixe");
        Mamifero gato = new Mamifero("gato1", "Mamifero");

        Animal[] animalArray = new Animal[]{peixe, cachorro, gato};
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
            resultados[i] = new Resultado(retur[0].getNomeEspecie(),n[i]);
        }

        return resultados;

    }




}
