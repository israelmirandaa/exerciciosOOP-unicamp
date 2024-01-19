package polimorfismo.dominio.test.questao2;

import polimorfismo.dominio.questao2.ItemOrcamento;
import polimorfismo.dominio.questao2.ItemOrcamentoComplexo;


public class ItemOrcamentoTest01 {
    public static void main(String[] args) {


        ItemOrcamento queijo = new ItemOrcamento("preço 12, 40 R$ - Dia 12/03/2023", 15.40F);
        ItemOrcamento tomate = new ItemOrcamento("preco 23, 34 R$ - Dia 12/03/2023", 22.34F);


        String historico = "preco 23, 34 R$. Dia 12/03/2023";


        ItemOrcamento pneu = new ItemOrcamento(" 350,50 R$ - Dia 25/07/2023", 235.53F);
        ItemOrcamento retrovisor = new ItemOrcamento("150.23 R$ - Dia 21/07/2023", 160F);


        ItemOrcamentoComplexo camarro = new ItemOrcamentoComplexo("Camarro 2012", 230_230F, new ItemOrcamento[]{pneu, retrovisor});


        ItemOrcamentoComplexo restaurante = new ItemOrcamentoComplexo(historico, 203.400F, new ItemOrcamento[]{queijo, tomate});

        ItemOrcamento[] itemC = new ItemOrcamento[]{restaurante, camarro};


        ItemOrcamentoComplexo itemComplex = new ItemOrcamentoComplexo(historico, 12_405_49F, itemC);


        System.out.println(restaurante.encontraItem(historico));


        System.out.println(restaurante.getValor());


        System.out.println("ItemComplexo: ");

        System.out.println(itemComplex.encontraItem(historico));

        System.out.println(itemComplex.getValor());


    }
}
