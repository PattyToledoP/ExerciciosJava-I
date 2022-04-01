public class Exercicio15 {
	public static void main(String[] args) {
		double C, F;
		
		System.out.println("\nEste programa realiza a conversao de um valor de temperatura em Celsius para Farenheit.\n");
		
		System.out.print("Digite a temperatura em Celsius: ");
		C = Double.parseDouble(System.console().readLine());
		
		F = 9 * C / 5 + 32;
		
		System.out.printf("TEMPERATURA EM FARENHEIT = %f\n", F);
	}
}