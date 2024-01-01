package dominio;

import dominio.Animal;

public class Laboratorio implements Ferramentas {


    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
        int j = 1;
        Animal[] especieFiltrada = new Animal[j];
        Animal[] especies = new Animal[especieFiltrada.length - 1];


        for (int i = 0; i < completo.length; i++) {
            if (completo[i].getNomeEspecie().equals(especieFiltrar)) {
                especieFiltrada[j - 1] = completo[i];
                j++;

                especies[i] = especieFiltrada[i];

            }
        }

        return especies;
    }

    @Override
    public String[] classificaEspecie(Animal[] completo) {
        int k = 1;
        String[] especies = new String[k];


        for (int i = completo.length-1; i >= 1; i--) {
            if (completo[i].getNomeEspecie().equals(completo[i-1].getNomeEspecie())) {
                completo[i] = null;
                continue;

            }
            k++;
        }
        especies = new String[k];

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
