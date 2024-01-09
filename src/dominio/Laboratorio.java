package dominio;

import dominio.Animal;

public class Laboratorio implements Ferramentas {


    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
        int j = 0;

        Animal[] especies = new Animal[completo.length];


        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null && completo[i].getNomeEspecie().equals(especieFiltrar)) {

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

    @Override
    public String[] classificaEspecie(Animal[] completo) {
        int k = 1;
        Animal[] especiesClass = new Animal[completo.length];


        for (int i = completo.length - 1; i >= 1; i--) {
            especiesClass[i] = completo[i];
            especiesClass[i-1] = completo[i-1];
            if (completo[i].getNomeEspecie().equals(completo[i - 1].getNomeEspecie())) {
                especiesClass[i] = null;
                continue;

            }
            k++;
        }
        String[] especies = new String[k];

        for (int j = 0; j < especies.length; j++) {
            if (completo[j] != null) {
                especies[j] = completo[j].getNomeEspecie();
            }

        }

        return especies;
    }

    public void test(Animal[] completo) {


    }


}
