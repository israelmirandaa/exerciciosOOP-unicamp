package dominio;

import dominio.Animal;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio implements Ferramentas {


    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
        int j = 0;

        Animal[] especies = new Animal[completo.length];


        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null && completo[i].getNomeEspecie().equalsIgnoreCase(especieFiltrar)) {

                especies[j] = completo[i];


                j++;

            }
        }
        Animal[] especieFiltrada = new Animal[j];

        for (int k = 0; k < especies.length; k++) {
            if (especies[k] != null) {
                especieFiltrada[k] = especies[k];
            }

        }


        return especieFiltrada;
    }


    //  public String[] classificaEspecie(Animal[] completo) {

    //    String[] especiesClass = new String[completo.length];

    //  for (int i = 0; i < completo.length - 1; i++) {
    //    especiesClass[i] = completo[i].getNomeEspecie();
    //      especiesClass[i + 1] = completo[i + 1].getNomeEspecie();

    //    if (especiesClass[i].equalsIgnoreCase(especiesClass[i + 1])) {
    //        especiesClass[i] = especiesClass[i + 1];
    //        especiesClass[i + 1] = null;

    //    }
    // }

    //for (int i = 0; i < especiesClass.length; i++) {
    //        if (especiesClass[i] == null) {
    //         especiesClass[i] = especiesClass[i + 1];
    //           especiesClass[i + 1] = null;
//
    //      }
//
    //    }


    //   return especiesClass;
    // }
    public String[] classificaEspecie(Animal[] completo) {

        List<String> especiesEncontradas = new ArrayList<>();
        String[] especies = new String[completo.length];

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


