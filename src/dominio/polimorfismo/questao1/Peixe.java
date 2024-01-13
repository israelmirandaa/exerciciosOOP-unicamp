package dominio.polimorfismo.questao1;

import dominio.polimorfismo.questao1.Animais;
import dominio.polimorfismo.questao1.Animal;

public class Peixe extends Animais implements Animal {


    public Peixe(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }


}
