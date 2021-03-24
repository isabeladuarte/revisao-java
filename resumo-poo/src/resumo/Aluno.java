package resumo;

public class Aluno extends Pessoa {
	public static int qtAluno = 0; // O static pertence a class, mas n�o � do objeto 
	
	private String rne;
	private int matricula;
	private Turma turma; // Agrega��o
	private Situacao situacaoAcademica;
	
	// Aluno estrangeiro
	public Aluno(String nome, String rne, int matricula, Turma turma) {
		super.setNome(nome);
		this.rne = rne;
		this.matricula = ++qtAluno;
		this.turma = turma;
		this.situacaoAcademica = Situacao.MATRICULADO;		
	}
	// Aluno Brasileiro
	public Aluno(String nome, Turma turma) {
		super.setNome(nome);
		this.matricula = ++qtAluno;
		this.turma = turma;
		this.situacaoAcademica = Situacao.MATRICULADO;
	}
	
	public Situacao getSituacaoAcademica() {
		return this.situacaoAcademica;
	}
	
	public double calcRefeicao() { // O aluno � obrigado implementar o m�todo calcRefeicao()
		return 5; // O professor paga 5,00 na refei��o
	}
	
	@Override
	public void login(String user, String senha) {
		System.out.println("Bem-vindo aluno "+user);
	}

	@Override
	public String toString() {
		return "Aluno [rne=" + rne + ", matricula=" + matricula + ", turma=" + turma + ", situacaoAcademica="
				+ situacaoAcademica + "]";
	}

}
