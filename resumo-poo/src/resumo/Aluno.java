package resumo;

public class Aluno extends Pessoa {
	public static int qtAluno = 0; // O static pertence a class, mas não é do objeto 
	
	private String rne;
	private int matricula;
	private Turma turma; // Agregação
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
	
	public double calcRefeicao() { // O aluno é obrigado implementar o método calcRefeicao()
		return 5; // O professor paga 5,00 na refeição
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
