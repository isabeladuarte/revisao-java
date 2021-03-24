package resumo;

public class Professor extends Pessoa implements Autenticacao {
	private String titulacao;
	private int siape;
	
	public Professor(String nome, String titulacao, int siape) {
		super.setNome(nome); // Acessa o atributo de pessoa com o super
		this.titulacao = titulacao;
		this.siape = siape;
	}

	@Override
	public String toString() {
		return "Professor [titulacao=" + titulacao + ", siape=" + siape + ", nome=" + getNome() + "]";
	}

	@Override // Por ser abstract, precisa ter o override, est� sobreescrevendo o m�todo
	public double calcRefeicao() { // O professor � obrigado implementar o m�todo calcRefeicao()
		return 10; // O professor paga 10,00 na refei��o
	}
	
	@Override
	public void login(String user, String senha) {
		System.out.println("Bem-vindo professor "+user);
	}
	
}
