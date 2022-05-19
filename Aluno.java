package modulostreams;

public class Aluno {

	final String nome;
	final double nota;
	
	public Aluno(String nome, double nota){
		this.nome = nome;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Aluno: " + nome + "\nNota: " + nota;
	}
}
