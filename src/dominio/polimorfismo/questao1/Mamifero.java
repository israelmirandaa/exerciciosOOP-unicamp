package dominio.polimorfismo.questao1;

import dominio.polimorfismo.questao1.Animais;
import dominio.polimorfismo.questao1.Animal;

public class Mamifero extends Animais implements Animal {


    public Mamifero(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;

    }


}
