package modulostreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.2);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.2);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNotas = a -> a.nota;
		
		BiFunction<Media, Double, Media> calcularMedia =
				(media, nota) -> media.adcionar(nota);
				
		BinaryOperator<Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1, m2);
				
		Media media = alunos.stream()
			.filter(aprovado)
			.map(apenasNotas)
			.reduce(new Media(), calcularMedia, combinarMedia);

		System.out.println("Média da turma: " + media.getValor());
	}

}
