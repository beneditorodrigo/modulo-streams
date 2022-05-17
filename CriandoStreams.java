package modulostreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		//criando direto com Stream of
		Stream<String> linguagens = Stream.of("Java ", "Lua ", "JS\n");
		
		linguagens.forEach(print);
		
		String[] maisLinguagens = {"Python ", "Lisp ", "Perl ", "GO\n"};
		//criando stream apartir de um array
		Stream.of(maisLinguagens).forEach(print);
		//utilizando o objeto Arrays
		Arrays.stream(maisLinguagens).forEach(print);
		//utilizando Arrays e definindo posição a serem passadas
		Arrays.stream(maisLinguagens, 1, 4).forEach(print);
		
		List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Kotlin\n");
		//stream com processamento sequencial
		outrasLinguagens.stream().forEach(print);
		//stream com processamento paralelo
		outrasLinguagens.parallelStream().forEach(print);
		
		//stream infinita
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n+1).forEach(print);
	}

}
