/*
 * author: Winne Pereira Ignacio Domingues
 * Matricula: 219.083.140
 * email: wdomingues@id.uff.br
 */

public class PedidoDieteticoBuilder implements Builder {

	private PedidoDietetico pedido;

	public void reset() {
		this.pedido = new PedidoDietetico();
	}

	public void buildPratoPrincipal() {

	}

	public void buildBebida() {

	}

	public void buildSobremesa() {

	}

	public void buildExtras() {

	}

	public PedidoDietetico getResultado() {
		return this.pedido;
	}

}
