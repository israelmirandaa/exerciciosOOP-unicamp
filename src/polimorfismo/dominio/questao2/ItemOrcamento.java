package polimorfismo.dominio.questao2;

public class ItemOrcamento {
        private String historico; // historico do item
        private float valor; // valor do item
        public ItemOrcamento(String historico, float valor) {
            this.historico = historico;
            this.valor = valor;
        }
        public String getHistorico() {
            return historico;
        }
        public float getValor() {
            return valor;
        }

    }
