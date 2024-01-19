package polimorfismo.dominio.questao2;


public class ItemOrcamentoComplexo extends ItemOrcamento {
    private ItemOrcamento[] subItens;

    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subItens) {
        super(historico, valor);
        this.subItens = subItens;

    }




    @Override
    public float getValor() {

        if (this.subItens != null) {

            float val = 0;
            for (int i = 0; i < subItens.length; i++) {
                val += subItens[i].getValor();
            }
            System.out.println("Soma de valores de todos os subItens: ");
            return val;
        }

        System.out.println("O orçamento não possui subItens!");
        return 0;

    }


    public ItemOrcamento encontraItem(String subItem) {
        if (subItens != null) {
            for (int i = 0; i < subItens.length; i++) {

                if (this.subItens[i].getHistorico().equalsIgnoreCase(subItem)) {
                    return this.subItens[i];
                }

            }
        }
        return null;


    }


}
