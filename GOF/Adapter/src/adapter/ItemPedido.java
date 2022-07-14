// Gabriel Figueiredo Vieira - 119083045
package adapter;

public class ItemPedido {

	private int id;
	private int idPedido;
	private int idProduto;
	private int quantidade;
	private double valorUnidade;
	
	public ItemPedido(int id, int idPedido, int idProduto, double valorUnidade, int quantidade) {
		super();
		this.id = id;
		this.idPedido = idPedido;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}
}
