public class Exercicio10 {
	public static void main(String[] args) {
		double pes, polegadas, jardas, milhas;
		
		System.out.println("\nEste programa realiza diversas conversoes de uma medida em pes.\n");
		
		System.out.print("Digite a medida em pes: ");
		pes = Double.parseDouble(System.console().readLine());
		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.printf("MEDIDA EM POLEGADAS = %f\n", polegadas);
		System.out.printf("MEDIDA EM JARDAS = %f\n", jardas);
		System.out.printf("MEDIDA EM MILHAS = %f\n", milhas);
	}
}