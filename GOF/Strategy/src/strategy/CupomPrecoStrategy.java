// Rodrigo dos Santos Carvalho - 218083093


package strategy;

public class CupomPrecoStrategy implements ICupomStrategy {

	private int valido_de = 20220701;
	private int valido_ate = 20220731;
	private double desconto = 0;

	@Override
	public double getDesconto(Pedido pedido) {
		if (pedido.getDataInicio() >= this.valido_de && pedido.getDataInicio() <= this.valido_ate) {
			if (pedido.getTotal() >= 50 && pedido.getTotal() < 100) {
				this.desconto = 10;
			} else if (pedido.getTotal() >= 100 && pedido.getTotal() < 150) {
				this.desconto = 15;
			} else if (pedido.getTotal() >= 150) {
				this.desconto = 20;
			}
		}
		
		return pedido.getTotal() - pedido.getTotal() * (this.desconto / 100);
	}

	
}
