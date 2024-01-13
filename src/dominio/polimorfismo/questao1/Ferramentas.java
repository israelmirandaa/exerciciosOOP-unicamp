package dominio.polimorfismo.questao1;

import dominio.polimorfismo.questao1.Animal;

public interface Ferramentas {

     Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);

     String[] classificaEspecie(Animal[] completo);




}
