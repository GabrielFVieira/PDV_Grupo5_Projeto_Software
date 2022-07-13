// Rodrigo dos Santos Carvalho - 218083093

package strategy;

public class CupomQuantidadeStrategy implements ICupomStrategy {
	private int valido_de = 20220701;
	private int valido_ate = 20220731;
	private double desconto = 0;

	@Override
	public double getDesconto(Pedido pedido) {
		if (pedido.getDataInicio() >= this.valido_de && pedido.getDataInicio() <= this.valido_ate) {
			if (pedido.getQuantidade() >= 3 && pedido.getQuantidade() < 5) {
				this.desconto = 5;
			} else if (pedido.getQuantidade() >= 5 && pedido.getQuantidade() < 10) {
				this.desconto = 10;
			} else if (pedido.getQuantidade() > 10) {
				this.desconto = 15;
			}
		}

		return pedido.getTotal() - pedido.getTotal() * (this.desconto / 100);
	}

}
