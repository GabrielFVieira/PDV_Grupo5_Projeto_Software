/*
 * author: Winne Pereira Ignacio Domingues
 * Matricula: 219.083.140
 * email: wdomingues@id.uff.br
 */

public class PedidoComumBuilder implements Builder {

	private PedidoComum pedido;

	public void reset() {
		this.pedido = new PedidoComum();
	}

	public void buildPratoPrincipal() {

	}

	public void buildBebida() {

	}

	public void buildSobremesa() {

	}

	public void buildExtras() {

	}

	public PedidoComum getResultado() {
		return this.pedido;
	}
}
