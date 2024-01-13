package dominio.polimorfismo.questao1;

import dominio.polimorfismo.questao1.Animal;
import dominio.polimorfismo.questao1.Ferramentas;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio implements Ferramentas {


    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
        int k = 0;
        Animal[] especies = new Animal[completo.length];

        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null && completo[i].getNomeEspecie().equalsIgnoreCase(especieFiltrar)) {

                especies[k] = completo[i];

                k++;

            }
        }
        Animal[] especieFiltrada = new Animal[k];

        for (int j = 0; j < especies.length; j++) {
            if (especies[j] != null) {
                especieFiltrada[j] = especies[j];
            }

        }

        return especieFiltrada;
    }




    public String[] classificaEspecie(Animal[] completo) {

        List<String> especiesEncontradas = new ArrayList<>();

        String[] animaisArray = new String[completo.length];

        for (int i = 0; i < completo.length; i++) {
            animaisArray[i] = completo[i].getNomeEspecie().toLowerCase();

        }

        for (int j = 0; j < animaisArray.length; j++) {
            if (!especiesEncontradas.contains(animaisArray[j])) {
                especiesEncontradas.add(animaisArray[j]);
            }

        }

        animaisArray = especiesEncontradas.toArray(new String[0]);
        return animaisArray;
    }


}


