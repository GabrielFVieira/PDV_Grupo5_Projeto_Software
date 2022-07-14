/*
* author: Winne Pereira Ignacio Domingues
* Matricula: 219.083.140
* email: wdomingues@id.uff.br
*/

public class Diretor {

	private Builder builder;

	private Cliente cliente;

	public Diretor(Builder builder) {

	}

	public void mudarBuilder(Builder builder) {

	}

	public void preparar() {

	}

	public void pedidoComum(PedidoComumBuilder builder) {
		builder.reset();
		builder.buildPratoPrincipal();
		builder.buildBebida();
		builder.buildSobremesa();
		builder.buildExtras();
	}

	public void pedidoDietetico(PedidoDieteticoBuilder buider) {
		builder.reset();
		builder.buildPratoPrincipal();
		builder.buildBebida();
		builder.buildSobremesa();
		builder.buildExtras();
	}
}
