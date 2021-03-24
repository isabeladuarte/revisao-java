package resumo;

public class Disciplina {
	private String nome;
	private Professor professor; // Associa��o
	
	public Disciplina(String nome, Professor professor) {
		super();
		this.nome = nome;
		this.professor = professor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", professor=" + professor + "]";
	}
	
}
