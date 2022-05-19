package modulostreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 2564.80, 0.29, 50);
		Produto p2 = new Produto("Monitor", 470.00, 0.30, 0);
		Produto p3 = new Produto("Mesa", 680.90, 0.31, 0);
		Produto p4 = new Produto("Impressora", 900.80, 0.40, 50);
		Produto p5 = new Produto("Teclado", 210.00, 0.35, 0);
		Produto p6 = new Produto("Cam Studio", 1300.90, 0.30, 0);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		// lambda para testar se tem 30% ou mais de desconto
		Predicate<Produto> descontoPromocional = p -> p.desconto >= 0.3;
		// testa se o frete é grátis (R$ 0.00)
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		// testa de o preço é relevante
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		//map para formatar a saída
		Function<Produto, String> produtosPromocionais = (prod) -> {
			return "Aproveite " + prod.nome + " por R$ "
					+ prod.preco * (1 - prod.desconto)
					+ "\nFrete Grátis";
		};
		
		produtos.stream()
			.filter(descontoPromocional)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(produtosPromocionais)
			.forEach(System.out::println);
	}
}
