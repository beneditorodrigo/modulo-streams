package modulostreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Consumer<Object> print = System.out::println;

		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string binária... "110" => "011"
		 * 3. Converter de volta para inteiro... "011" => 3
		 */

		Function<Integer, String> inteiroToString = (numero) -> {
			return String.valueOf(Integer.toBinaryString(numero));
		};

		UnaryOperator<String> inverterString = numeroBinario -> {
			// primeira forma de inverter string
			return new StringBuilder(numeroBinario).reverse().toString();

			// segunda forma de inverter string
//			String numeroReverso = "";
//			for (int i = numeroBinario.length() - 1; i >= 0; i--) {
//				numeroReverso += numeroBinario.charAt(i);
//			}
//			return numeroReverso;
		};

		Function<String, Integer> stringToInteger = stringBinaria -> {
			return Integer.parseInt(stringBinaria, 2);
		};

		numeros.stream()
		.map(inteiroToString)
		.map(inverterString)
		.map(stringToInteger)
		.forEach(print);

	}

}
