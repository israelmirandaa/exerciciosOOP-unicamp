package dominio.polimorfismo.questao1;

public class Animais implements Animal {
    protected String nome;
    protected String especie;


    @Override
    public String getNomeEspecie() {
        return this.especie;
    }

    @Override
    public String getNomeAnimal() {
        return this.nome;
    }


}
