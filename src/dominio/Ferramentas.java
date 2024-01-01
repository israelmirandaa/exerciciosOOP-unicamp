package dominio;

import dominio.Animal;

public interface Ferramentas {

     Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);

     String[] classificaEspecie(Animal[] completo);




}
