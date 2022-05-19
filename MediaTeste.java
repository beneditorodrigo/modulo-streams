package modulostreams;

public class MediaTeste {

	public static void main(String[] args) {
		Media m1 = new Media().adcionar(8.3).adcionar(6.7);
		Media m2 = new Media().adcionar(7.9).adcionar(6.6);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
