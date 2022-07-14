/*
 * author: Winne Pereira Ignacio Domingues
 * Matricula: 219.083.140
 * email: wdomingues@id.uff.br
 */

public interface Builder {
	Diretor diretor;

	public void buildPratoPrincipal();

	public void buildBebida();

	public void buildSobremesa();

	public void buildExtras();

	public abstract void reset();
}
