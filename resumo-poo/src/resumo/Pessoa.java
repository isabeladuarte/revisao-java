package resumo;

public abstract class Pessoa implements Autenticacao {
	private String nome;
	public abstract double calcRefeicao();
	// Não tem constructor, pois você não instancia uma classa abstrata
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
}
