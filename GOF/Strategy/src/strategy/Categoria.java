// Rodrigo dos Santos Carvalho - 218083093

package strategy;

public class Categoria {
	private int id;
	private String nome;
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	

}
