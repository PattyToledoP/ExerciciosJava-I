public class Exercicio03 {
	public static void main(String[] args) {
		double n1, n2, n3, media;
		
		System.out.println("\nEste programa realiza o calculo da media de tres notas de um estudante.\n");
		
		System.out.print("Digite a primeira nota.: ");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a segunda nota..: ");
		n2 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a terceira nota.: ");
		n3 = Double.parseDouble(System.console().readLine());
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.printf("RESULTADO = %.1f\n", media);
	}
}