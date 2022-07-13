// Gabriel Figueiredo Vieira - 119083045
package adapter;

import adapter.IPagamento;

public class Visa implements IPagamento {

	private VisaClient client;

    public Visa(VisaClient client) {
        this.client = client;
    }

	public boolean pagar(Pedido pedido) {
        double total = pedido.getTotalComDesconto();
        VisaResult resultado = client.efetuarCobranca(total, "Pedido #" + pedido.getCodigo());

        if (resultado.getStatusCode() < 100) {
            return true;
        } else {
            return false;
        }
    }
}
