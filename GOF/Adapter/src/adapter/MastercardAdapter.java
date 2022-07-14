// Gabriel Figueiredo Vieira - 119083045
package adapter;

import adapter.IPagamento;

public class MasterCard implements IPagamento {

	private MasterCardClient client;

    public MasterCard(MasterCardClient client) {
        this.client = client;
    }

	public boolean pagar(Pedido pedido) {
        double total = pedido.getTotalComDesconto();
        MasterCardResult resultado = client.solicitarPagamento(total);

        if ("SUCESSO" == resultado.getStatus()) {
            return true;
        } else {
            return false;
        }
    }
}
