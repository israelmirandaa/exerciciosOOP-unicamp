package polimorfismo.dominio.questao2;


public class ItemOrcamentoComplexo extends ItemOrcamento {
    private ItemOrcamento[] subItens;


    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subItens) {
        super(historico, valor);
        this.subItens = subItens;


    }


    @Override
    public float getValor() {

        float val = 0;
        float valorReal = 0;

        if (subItens.length != 0) {

            for (int i = 0; i < subItens.length; i++) {

                val += subItens[i].getValor();


            }
            return val;
        }

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
