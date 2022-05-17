package modulostreams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	// bloquear para não instanciar
	private Utilitarios() {

	}

	public final static UnaryOperator<String> marcasMaiuscula = 
			n -> n.toUpperCase();

	public final static UnaryOperator<String> marcasPrimeiraLetra = 
			n -> n.charAt(0) + "";

	public static String marcasGrito(String n) {
		return n + "!!! ";
	}
}
