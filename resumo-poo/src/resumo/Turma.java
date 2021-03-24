package resumo;

// Triagulo no diagrama de classa � heran�a

public class Turma {
	private String sigla;
	private String curso;
	
	// V� em source -> Generate Constructor using fields para criar o constructor
	public Turma(String sigla, String curso) { //Cria um objeto na mem�ria do computador
		this.sigla = sigla;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", curso=" + curso + "]";
	}
	
	// Como os atributos est�o privados, precisa colocar get e set para acessar os atributos

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
