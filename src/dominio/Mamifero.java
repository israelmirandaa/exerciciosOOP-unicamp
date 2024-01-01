package dominio;

import dominio.Animal;

public class Mamifero implements Animal {
    private String nome;
    private String especie;

    public Mamifero(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;

    }



    @Override
    public String getNomeEspecie() {
        return this.especie;
    }

    @Override
    public String getNomeAnimal() {
        return this.nome;
    }
}
