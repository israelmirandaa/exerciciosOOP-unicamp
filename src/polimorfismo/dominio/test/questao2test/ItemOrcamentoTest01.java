package polimorfismo.dominio.test.questao2test;

import polimorfismo.dominio.questao2.ItemOrcamento;
import polimorfismo.dominio.questao2.ItemOrcamentoComplexo;


public class ItemOrcamentoTest01 {
    public static void main(String[] args) {


        ItemOrcamento queijo = new ItemOrcamento("preço 12, 40 R$ - Dia 12/03/2023", 15.40F);
        ItemOrcamento tomate = new ItemOrcamento("preco 23, 34 R$ - Dia 12/03/2023", 22.34F);


        String historico = "preco 23, 34 R$. Dia 12/03/2023";


        ItemOrcamento pneu = new ItemOrcamento(" 350,50 R$ - Dia 25/07/2023", 23F);
        ItemOrcamento retrovisor = new ItemOrcamento("150.23 R$ - Dia 21/07/2023", 16F);

        ItemOrcamentoComplexo itemComplex = new ItemOrcamentoComplexo(historico, 12F, new ItemOrcamento[] {retrovisor});

        ItemOrcamentoComplexo restaurante = new ItemOrcamentoComplexo(historico, 20F, new ItemOrcamento[]{queijo, tomate});


        ItemOrcamentoComplexo camarro = new ItemOrcamentoComplexo("Camarro 2012", 20F, new ItemOrcamento[]{pneu, retrovisor});




        ItemOrcamento[] itemC = new ItemOrcamento[]{restaurante, camarro};

        ItemOrcamentoComplexo complexo = new ItemOrcamentoComplexo("test", 250, new ItemOrcamento[] {restaurante, camarro, itemComplex});


        ItemOrcamentoComplexo complexo2 = new ItemOrcamentoComplexo("test2", 230, new ItemOrcamento[] {complexo, restaurante, camarro, restaurante, itemComplex});










        System.out.println("Final Test: " + restaurante.encontraItem(historico));


        System.out.println("TESSST: " + restaurante.getValor());
        System.out.println("TEST2: " + itemComplex.getValor());

        System.out.println("\n Test3: " + complexo.getValor());


        System.out.println("\nTestFinal: " + complexo2.getValor());









    }
}
