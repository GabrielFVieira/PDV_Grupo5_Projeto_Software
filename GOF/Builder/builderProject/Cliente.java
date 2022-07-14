/*
 * author: Winne Pereira Ignacio Domingues
 * Matricula: 219.083.140
 * email: wdomingues@id.uff.br
 */

public class Cliente {
	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		PedidoComumBuilder builderComum = new PedidoComumBuilder();
		PedidoDieteticoBuilder builderDietetico = new PedidoDieteticoBuilder();

		PedidoComum pedidoComum = builderComum.getResultado();
		PedidoDietetico pedidoDietetico = builderDietetico.getResultado();
	}
}
