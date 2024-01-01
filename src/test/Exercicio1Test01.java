package test;

import dominio.*;

public class Exercicio1Test01 {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Fulano", "Mamifero");
        Peixe peixe = new Peixe("Peixe espada", "Peixe");
        Mamifero gato = new Mamifero("gato1", "Mamifero");

        Animal[] animalArray = new Animal[]{peixe, cachorro, gato};
        Laboratorio laboratorio = new Laboratorio();


        for (String j : laboratorio.classificaEspecie(animalArray)) {
            System.out.println(j);
        }
    }


        public static void test (Animal[]animal, Ferramentas ferramentas){
            System.out.println();

        }




}
