// Rodrigo dos Santos Carvalho - 218083093


package strategy;

public class main {

	public static void main(String[] args) {
		
		Categoria principal = new Categoria(1, "Hamburguer");
		Categoria bebida = new Categoria(2, "Bebida");
		Categoria acompanhamento = new Categoria(3, "Acompanhamento");
		
		Produto hamburguer = new Produto(1,"H8",principal, "Hamburguer", "Pão, carne e ovo", 25, true);
		Produto cocaKs = new Produto(2,"B4",bebida, "Coca-Cola KS", "Coca-cola king size", 10, true);
		Produto batataMedia = new Produto(3,"A2",acompanhamento, "Batata-Frita M", "Batatinha oleo e sal", 20, true);
		Produto agua = new Produto(4,"B1",bebida, "Agua", "H20", 5, true);

		Pedido p1 = new Pedido(1, 20220712);
		Pedido p2 = new Pedido(2, 20220712);
		
		ItemPedido i1 = new ItemPedido(1, p1.getId(), hamburguer.getId(), hamburguer.getPreco(), 2);
		ItemPedido i2 = new ItemPedido(1, p1.getId(), cocaKs.getId(), cocaKs.getPreco(), 2);
		ItemPedido i3 = new ItemPedido(2, p2.getId(), hamburguer.getId(), hamburguer.getPreco(), 1);
		ItemPedido i4 = new ItemPedido(2, p2.getId(), batataMedia.getId(), batataMedia.getPreco(), 1);
		ItemPedido i5 = new ItemPedido(2, p2.getId(), agua.getId(), agua.getPreco(), 1);
		
		p1.addItemPedido(i1);	
		p1.addItemPedido(i2);
		
		p1.setDesconto(new CupomPrecoStrategy());
		
		p2.addItemPedido(i3);	
		p2.addItemPedido(i4);
		p2.addItemPedido(i5);
		
		p2.setDesconto(new CupomQuantidadeStrategy());
		
		
		System.out.println(p1.getTotal());
		System.out.println(p1.getTotalComDesconto());
		
		System.out.println(p2.getTotal());
		System.out.println(p2.getTotalComDesconto());
	}

}
