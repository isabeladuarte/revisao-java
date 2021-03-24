package resumo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sigla: ");
		String sigla = entrada.next();
		
		Turma t1 = new Turma(sigla, "ADS");
		System.out.println(t1.toString()); // toString tr�s o endere�o da mem�ria em hex onde est� salvo o obj
		
		Professor p = new Professor("Johnata", "Mestre", 111);
		System.out.println(p.toString());
		
		Aluno a = new Aluno("Isabela", t1);
		Aluno b = new Aluno("Guilherme", t1);
		
		System.out.println("Alunos: " +Aluno.qtAluno);
		
		Disciplina d = new Disciplina("LG2A2", p);
		System.out.println(d.toString());
		
		Avaliacao av = new Avaliacao(10, d, b);
		System.out.println(av.toString());
	}

}
