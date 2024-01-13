package dominio.polimorfismo.questao1;

import dominio.polimorfismo.questao1.Animais;
import dominio.polimorfismo.questao1.Animal;

public class Aves extends Animais implements Animal {


    public Aves (String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
}
