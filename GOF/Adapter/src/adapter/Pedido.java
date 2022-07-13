// Gabriel Figueiredo Vieira - 119083045
package adapter;

import java.util.ArrayList;

public class Pedido {

	private int id;
	private int codigo;
	private int dataInicio;
	private int dataFim;
	private StatusPedido status;
	private ArrayList<ItemPedido> itens;

	public int getCodigo() {
		return this.codigo;
	}

	public double getTotal() {
		int soma = 0;
		for (ItemPedido item : itens) {
			soma += item.getValorUnidade() * item.getQuantidade();

		}
		return soma;
	}

	public double getTotalComDesconto() {
		return this.cupomStrategy.getDesconto(this);
	}
}
