// Rodrigo dos Santos Carvalho - 218083093


package strategy;

import java.util.ArrayList;

public class Pedido {

	private int id;
	private int codigo;
	private int dataInicio;
	private int dataFim;
	private StatusPedido status;
	private ArrayList<ItemPedido> itens = new ArrayList<>();
	private ICupomStrategy cupomStrategy;

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public void addItemPedido(ItemPedido pedido) {
		this.itens.add(pedido);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDataFim() {
		return dataFim;
	}

	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}

	public double getTotal() {
		int soma = 0;
		for (ItemPedido item : itens) {
			soma += item.getValorUnidade() * item.getQuantidade();

		}
		return soma;
	}

	public int getQuantidade() {
		int quantidade = 0;
		for (ItemPedido item : itens) {
			quantidade += item.getQuantidade();
		}
		return quantidade;
	}

	public void setDesconto(ICupomStrategy cupom) {
		this.cupomStrategy = cupom;
	}

	public double getTotalComDesconto() {
		return this.cupomStrategy.getDesconto(this);
	}

	public Pedido(int id, int dataInicio) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
